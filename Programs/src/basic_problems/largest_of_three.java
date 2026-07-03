package basic_problems;
// import java.util.Scanner;

public class largest_of_three {

  int largest(int a, int b, int c) {
    if (a >= b && a >= c) {
      return a;
    } else if (b >= a && b >= c) {
      return b;
    } else {
      return c;
    }
  }

  public static void main(String[] args) {
    // Scanner kb = new Scanner(System.in);

    // largest_of_three obj = new largest_of_three();

    // System.out.println("enter three numbers: ");
    // int x = kb.nextInt();
    // int y = kb.nextInt();
    // int z = kb.nextInt();

    // int l = obj.largest(x, y, z);

    // System.out.println("the largest is: " + l);
  }

}
