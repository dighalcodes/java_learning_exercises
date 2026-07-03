package basic_problems;


class employee {
  int salary;

  int getsalary() {
    return salary;
  }

  String name;

  String getname() {
    return name;
  }

  void setName(String n) {
    name = n;
  }
}

public class employee_details {
  public static void main(String[] args) {

    employee k = new employee();
    k.salary = 12000;
    k.name = "Hitesh";

    k.setName("Rohan");

    System.out.println(k.getsalary());
    System.out.println(k.getname());

  }
}
