package small_project_based_learning;

import java.util.ArrayList;

public class college {

    public static void main(String[] args) {
        // Student s1 = new Student("S001", "Alice", "alice@gmail.com", "Computer Science", 3.8);
        // s1.displayInfo();

        // s1.setGpa(5.5);
        // s1.setGpa(3.2);

        ArrayList<CollegeMember> member = new ArrayList<>();

        member.add(new Student("S0001", "Hitesh", "hitesh@gmail.com", "CSE", 7.9));
        member.add(new Student("S0002", "Dinesh", "Dinesh@gmail.com", "ME", 8.6));

        member.add(new Professor("P0001", "Harry", "harry@gmail.com", "CSE", 90000));
        member.add(new Professor("P0002", "George", "george@gmail.com", "ME", 200000));

        for(CollegeMember m:member){
            m.displayInfo();
        }
    }
}

abstract class CollegeMember {
    private String Id;
    protected String name;
    private String email;

    CollegeMember(String Id, String name, String email) {
        this.Id = Id;
        this.name = name;
        this.email = email;
    }

    public String getId() {
        return Id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if (email == null || email.trim().isEmpty()) {
            System.out.println("invalid email");
        } else {
            this.email = email;
        }
    }

    public abstract String getRole();

    public void displayInfo() {
        System.out.println("------------------");

        System.out.println("Name  : " + getName());
        System.out.println("Id    : " + getId());
        System.out.println("email : " + getEmail());
        System.out.println("Role  : " + getRole());

        System.out.println("------------------");
    }
}

class Student extends CollegeMember {
    private String major;
    private double gpa;

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

    @Override
    public String getRole() {
        return "Student";
    }
}

class Professor extends CollegeMember {
    private String department;
    private double salary;

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

    @Override
    public String getRole() {
        return "Professor";
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Department : " + department);
        System.out.println("Salary     : " + salary);
        System.out.println("------------------");
    }

}