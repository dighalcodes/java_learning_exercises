package small_project_based_learning;

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

    public void seName(String name) {

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

    public double getGPA() {
        if (gpa >= 0.0 && gpa <= 4.0) {
            return gpa;
        }
        return gpa;
    }

    @Override
    public String getRole() {

        return "Student";
    }
}

public class college {

    public static void main(String[] args) {
        System.out.println("shk");
    }

}