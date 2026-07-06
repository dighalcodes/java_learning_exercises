package basic_problems;

import java.util.HashMap;
import java.util.TreeMap;
import java.util.Map;

public class practice_Map {
    public static void main(String[] args) {
        Map<String, Integer> scores = new HashMap<>();

        // Map<String, Integer> TreeMap = new TreeMap<>();
        // Map<Integer, Integer> freqMap = new HashMap<>();

        // method-1

        scores.put("Alice", 90);
        scores.put("Bob", 75);
        scores.put("Alice", 95);
        System.out.println(scores);

        /*
         * // method-2
         * System.out.println(scores.get("Alice"));
         * 
         * // method-3
         * System.out.println(scores.containsKey("Charlie"));
         * 
         * // method-4
         * System.out.println(scores.getOrDefault("Charlie", 1));
         * 
         * // method-5
         * scores.remove("Bob");
         */

    }

}
