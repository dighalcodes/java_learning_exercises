package small_project_based_learning;

import java.util.ArrayList;

public class college {

    public static void main(String[] args) {
        // Student s1 = new Student("S001", "Alice", "alice@gmail.com", "Computer
        // Science", 3.8);
        // s1.displayInfo();

        // s1.setGpa(5.5);
        // s1.setGpa(3.2);

        // POLYMORPHIC LIST
        // Type is ArrayList<CollegeMember> — the parent type.
        // Java allows Student and Professor objects to be stored here
        // because both ARE-A CollegeMember (Liskov Substitution Principle).
        ArrayList<CollegeMember> member = new ArrayList<>();

        member.add(new Student("S0001", "Hitesh", "hitesh@gmail.com", "CSE", 7.9));
        member.add(new Student("S0002", "Dinesh", "Dinesh@gmail.com", "ME", 8.6));

        member.add(new Professor("P0001", "Harry", "harry@gmail.com", "CSE", 900000));
        member.add(new Professor("P0002", "George", "george@gmail.com", "ME", 700000));

        // LOOP 1: Polymorphic displayInfo()
        // 'm' is typed as CollegeMember, but Java calls the correct
        // displayInfo() for each actual object at RUNTIME (dynamic dispatch):
        // Student → CollegeMember.displayInfo()
        // Professor → Professor.displayInfo() (which calls super first)
        for (CollegeMember m : member) {
            m.displayInfo();
        }

        // LOOP 2: Monthly Pay Report
        // calculateMonthlyPay() is abstract in CollegeMember —
        // each subclass has its own implementation.
        // Same method call, different behavior per object = polymorphism.
        System.out.println("=== Monthly Pay Report ===");
        for (CollegeMember m : member) {
            System.out.println(m.getName() + " (" + m.getRole() + ") " +
                    m.calculateMonthlyPay());
        }

        // LOOP 3: Overloading + Interface contract
        // printPayInfo("INR") calls the overloaded version with currency.
        // getPaySummary() fulfills the Payable interface contract —
        // each subclass returns its own formatted summary string.
        for (CollegeMember m : member) {
            m.printPayInfo("INR");
            System.out.println(m.getPaySummary());
        }
    }
}

// ============================================================
// COLLEGE MANAGEMENT SYSTEM
// Concepts covered: Encapsulation, Inheritance, Abstraction,
// Polymorphism, Interfaces, Getters/Setters, this, super,
// Access Modifiers, Constructors, Method Overloading/Overriding
// ============================================================

// ------------------------------------------------------------
// INTERFACE: Payable
// A pure contract — no fields, no constructors.
// Any class that implements this MUST provide getPaySummary().
// Interfaces allow unrelated classes to share a contract
// without being forced into the same inheritance hierarchy.
// ------------------------------------------------------------

interface payable {
    // Abstract by default in interfaces — no 'abstract' keyword needed.
    // Every implementing class must return a formatted pay summary string.
    String getPaySummary();
}

// ------------------------------------------------------------
// ABSTRACT CLASS: CollegeMember
// The base of our hierarchy. Cannot be instantiated directly
// because a raw "CollegeMember" doesn't exist in a real college —
// only Students and Professors do.
//
// Implements Payable — passes the getPaySummary() obligation
// down to concrete subclasses.
// ------------------------------------------------------------

abstract class CollegeMember implements payable {

    // private — only accessible within this class.
    // Id should never change after creation, so no setter is provided.
    private String Id;

    // protected — accessible in this class AND all subclasses.
    // Subclasses like Student and Professor can read 'name' directly.
    protected String name;

    // private — subclasses must go through getEmail()/setEmail().
    private String email;

    // CONSTRUCTOR: Parameterized
    // 'this' disambiguates between the parameter 'Id' and the field 'Id'.
    // Every subclass must call super(...) to initialize these fields,
    // since they are private and cannot be set directly from a subclass.
    CollegeMember(String Id, String name, String email) {
        this.Id = Id;
        this.name = name;
        this.email = email;
    }

    // GETTER: getId()
    // Id is private, so this is the only way to read it from outside.
    // No setter exists — Id is immutable after construction.
    public String getId() {
        return Id;
    }

    // GETTER: getName()
    public String getName() {
        return name;
    }

    // SETTER: setName()
    // 'this.name' refers to the field; 'name' refers to the parameter.
    // Without 'this', both sides would refer to the parameter (a no-op).
    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    // SETTER: setEmail() — with validation
    // Rejects null values and blank/whitespace-only strings.
    // trim() strips leading/trailing spaces before checking isEmpty().
    public void setEmail(String email) {
        if (email == null || email.trim().isEmpty()) {
            System.out.println("invalid email");
        } else {
            this.email = email;
        }
    }

    // ABSTRACT METHOD: getRole()
    // Declared here but NOT implemented — every concrete subclass
    // must override this and return their specific role string.
    // This enforces the contract: every CollegeMember must have a role.
    public abstract String getRole();

    // ABSTRACT METHOD: calculateMonthlyPay()
    // The logic differs per subclass:
    // Student → fixed stipend
    // Professor → annual salary / 12
    // Declaring it abstract here also satisfies the Payable interface's
    // implicit requirement that pay can be calculated.
    public abstract double calculateMonthlyPay();

    // ABSTRACT METHOD: calculateMonthlyPay()
    // The logic differs per subclass:
    // Student → fixed stipend
    // Professor → annual salary / 12
    // Declaring it abstract here also satisfies the Payable interface's
    // implicit requirement that pay can be calculated.
    public void displayInfo() {
        System.out.println("------------------");

        System.out.println("Name  : " + getName());
        System.out.println("Id    : " + getId());
        System.out.println("email : " + getEmail());
        System.out.println("Role  : " + getRole());

        System.out.println("------------------");
    }

    // OVERLOADED METHOD: printPayInfo() — Version 1 (no parameter)
    // Prints the member's name and monthly pay with no currency label.
    // Method overloading: same name, different parameter list.
    // Java picks this version at COMPILE TIME when no argument is passed.
    public void printPayInfo() {
        System.out.println("Name: " + name + " " + calculateMonthlyPay());
    }

    // OVERLOADED METHOD: printPayInfo(String) — Version 2 (with currency)
    // Prints the member's name, currency label, and monthly pay.
    // Java picks this version at COMPILE TIME when a String argument is passed.
    public void printPayInfo(String currency) {
        System.out.println("Name: " + name + " " + currency + " " + calculateMonthlyPay());
    }
}

// ------------------------------------------------------------
// CLASS: Student
// Extends CollegeMember — inherits all fields and methods.
// Adds its own fields: major and gpa.
// Must implement both abstract methods: getRole() and calculateMonthlyPay().
// ------------------------------------------------------------
class Student extends CollegeMember {
    private String major;
    private double gpa;

    // CONSTRUCTOR
    // Calls super() as the FIRST line to initialize inherited private fields
    // (Id, name, email) via the parent constructor.
    // Then initializes Student-specific fields using 'this'.
    Student(String Id, String name, String email, String major, double gpa) {
        super(Id, name, email);
        this.major = major;
        this.gpa = gpa;
    }

    public String getMajor() {
        return major;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        if (gpa >= 0.0 && gpa <= 4.0) {
            this.gpa = gpa;
        } else {
            System.out.println("Invalid GPA.");
        }
    }

    // OVERRIDE: getRole()
    // Fulfills the abstract contract from CollegeMember.
    // @Override tells the compiler to verify the parent has this method —
    // catches typos like getrol() at compile time instead of silently
    // creating a new unrelated method.
    @Override
    public String getRole() {
        return "Student";
    }

    // OVERRIDE: calculateMonthlyPay()
    // Students receive a fixed monthly stipend regardless of other factors.
    // Fulfills both the abstract method in CollegeMember and the
    // implicit Payable contract.
    @Override
    public double calculateMonthlyPay() {
        return 1500.0;
    }

    // OVERRIDE: getPaySummary()
    // Fulfills the getPaySummary() contract from the Payable interface.
    // Returns a formatted string describing this student's pay.
    @Override
    public String getPaySummary() {
        return getRole() + " " + name + " " + " | " + "Stipend: " + calculateMonthlyPay();
    }

}

// ------------------------------------------------------------
// CLASS: Professor
// Extends CollegeMember — inherits all fields and methods.
// Adds its own fields: department and salary.
// Overrides displayInfo() to add department and salary output.
// Must implement both abstract methods: getRole() and calculateMonthlyPay().
// ------------------------------------------------------------
class Professor extends CollegeMember {
    private String department;
    private double salary;

    // CONSTRUCTOR
    // super() initializes the inherited private fields.
    // 'this' initializes Professor-specific fields.
    Professor(String Id, String name, String email, String department, double salary) {
        super(Id, name, email);
        this.department = department;
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if (salary > 0.0) {
            this.salary = salary;
        } else {
            System.out.println("Invalid salary");
        }

    }

    // OVERRIDE: getRole()
    // Fulfills the abstract contract. Returns "Professor".
    @Override
    public String getRole() {
        return "Professor";
    }

    // OVERRIDE: displayInfo()
    // Calls super.displayInfo() first to reuse the parent's output
    // (name, id, email, role), then appends Professor-specific fields.
    // This is 'super' used in a METHOD (different from super() in a constructor).
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Department : " + department);
        System.out.println("Salary     : " + salary);
        System.out.println("------------------");
    }

    // OVERRIDE: calculateMonthlyPay()
    // Professors are paid monthly = annual salary divided by 12.
    @Override
    public double calculateMonthlyPay() {
        return salary / 12;
    }

    // OVERRIDE: getPaySummary()
    // Fulfills the getPaySummary() contract from the Payable interface.
    // Returns a formatted string describing this professor's monthly pay.
    @Override
    public String getPaySummary() {
        return getRole() + " " + name + " " + " | " + "Monthly: " + calculateMonthlyPay();
    }

}