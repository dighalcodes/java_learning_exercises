package basic_problems;

import java.util.ArrayList;
import java.util.List;

public class practice_ArrayList {

  // METHOD OD PROBLEM-5
  public static List<Integer> findDupes(List<Integer> input) {

    List<Integer> result = new ArrayList<Integer>();

    for (int i = 0; i < input.size(); i++) {
      int count = 0;
      for (int j = 0; j < input.size(); j++) {
        if (input.get(i).equals(input.get(j))) {
          count++;
        }
      }
      if (count > 1 && !result.contains(input.get(i))) {
        result.add(input.get(i));
      }
    }
    return result;
  }

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

    // ArrayList<Integer> list4 = new ArrayList<Integer>(List.of(1, 3, 5, 7, 5, 9));
    // System.out.println(list4);
    // list4.remove(2);
    // System.out.println(list4);

    // PROBLEM-5: You are given a `List<Integer>` that may contain duplicate
    // numbers. Write a method that returns a new `List<Integer>` containing only
    // the elements that appear more than once. Each duplicate value should appear
    // only once in your result. Order does not matter.

    List<Integer> input = new ArrayList<>(List.of(1, 3, 4, 3, 2, 1, 5));
    System.out.println(findDupes(input));

  }
}
