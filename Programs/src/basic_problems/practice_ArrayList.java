package basic_problems;
import java.util.ArrayList;
import java.util.List;

public class practice_ArrayList {
  public static void main(String[] args) {

    // problem-1:Create an ArrayList<String> and add the names of 5 fruits to it.
    // Then print each fruit on its own line using a loop.
    /*
     * ArrayList<String> list = new ArrayList<String>();
     * 
     * list.add("Apple");
     * list.add("Banana");
     * list.add("Banana");
     * list.add("Grape");
     * list.add("Kiwi");
     * 
     * for (int i = 0; i <= list.size() - 1; i++) {
     * System.out.println(list.get(i));
     * }
     */

    // problem-2 Create two ArrayLists of integers. Add numbers to the first list.
    // Leave the
    // second empty. Print the size of each list and whether each one is empty or
    // not.

    /*
     * ArrayList<Integer> list1 = new ArrayList<Integer>();
     * ArrayListsst1.add(10);
     * list1.add(20);
     * list1.add(30);
     * System.out.println(list1.size());
     * System.out.println(list1.isEmpty());
     * 
     * ArrayList<Integer> list2 = new ArrayList<Integer>();
     * System.out.println(list2.size());
     * System.out.println(list2.isEmpty());
     */

    // problem-3 Create an ArrayList with 4 city names. Replace the second city with
    // a different city name. Print the list before and after the change.

    /*
     * ArrayList<String> list3 = new ArrayList<String>(List.of("Delhi", "Mumbai",
     * "Kolkata", "Chennai"));
     * System.out.println("before: " + list3);
     * list3.set(1, "Pune");
     * System.out.println("after: " + list3);
     */

    // problem 4 Given an ArrayList of integers that contains one duplicate value
    // (the number 5 appears twice), find and remove the first occurrence of 5.
    // Print the list before and after.

    ArrayList<Integer> list4 = new ArrayList<Integer>(List.of(1, 3, 5, 7, 5, 9));
    System.out.println(list4);
    list4.remove(2);
    System.out.println(list4);

  }
}
