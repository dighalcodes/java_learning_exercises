package basic_problems;
import java.util.LinkedList;
import java.util.List;

public class linkedList_practice {
  public static void main(String[] args) {

    // problem-1 Create a LinkedList<String> representing a line of customers at a
    // shop. Add 5 customer names — the first two should be added to the front of
    // the line (they arrived early), and the last three should be added to the back
    // (they arrived later). Then print the full list, the name at the very front,
    // and the name at the very back.
    /*
     * LinkedList<String> l = new LinkedList<>();
     * 
     * // The first two should be added to the front of the line
     * // (Note: Adding "Riya" then "Amit" to the front puts "Amit" at the very
     * front)
     * l.addFirst("Riya");
     * l.addFirst("Amit");
     * 
     * // The last three should be added to the back
     * l.addLast("John");
     * l.addLast("Priya");
     * l.addLast("Sara");
     * 
     * // Print the results
     * System.out.println("Queue: " + l);
     * System.out.println("First: " + l.getFirst());
     * System.out.println("Last: " + l.getLast());
     */

    // problem-2 Start with a LinkedList<String> of 5 city names. Print the original
    // list and its size. Then serve (remove) the first city and the last city.
    // Print the updated list, its new size, and confirm whether a specific city
    // (your choice) is still in the list.

    // LinkedList<String> l = new LinkedList<>(List.of("Delhi", "Mumbai", "Kolkata",
    // "Chennai", "Pune"));
    // System.out.println("List is: " + l);
    // System.out.println("size of the list: " + l.size());
    // l.removeFirst();
    // l.removeLast();
    // System.out.println("Updated List is: " + l);
    // System.out.println("Updated size of the list: " + l.size());
    // System.out.println(l.contains("Kolkata"));

    // Problem-3 You are simulating a printer queue. Create a LinkedList<String>
    // with 4 document names. Use a while loop to process (remove and print)
    // documents one at a time from the front of the queue until it is empty. After
    // the loop, confirm the list is empty by printing its size.

    LinkedList<String> l = new LinkedList<>(List.of("Report.pdf", "Resume.docx", "Photo.png", "Notes.txt"));
    while (!l.isEmpty()) {
      String current_file = l.removeFirst();
      System.out.println(current_file);
    }
    System.out.println("new size: " + l.size());

  }
}
