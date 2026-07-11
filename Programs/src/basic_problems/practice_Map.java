package basic_problems;

import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;

public class practice_Map {

    public static int mostFrequent(List<Integer> input) {

        Map<Integer, Integer> freq = new HashMap<>();
        for (int i = 0; i < input.size(); i++) {
            freq.put(input.get(i), freq.getOrDefault(input.get(i), 0) + 1);
        }

        int maxCount = 0;
        int whichKey = 0;
        for (Map.Entry<Integer, Integer> entry : freq.entrySet()) {
            if (entry.getValue() > maxCount) {
                maxCount = entry.getValue();
                whichKey = entry.getKey();
            }
        }
        return whichKey;

    }

    public static void main(String[] args) {
        List<Integer> input = new ArrayList<>(List.of(3, 1, 4, 1, 5, 3, 3));

        System.out.println("Most Frequent: " + mostFrequent(input));
        
    }

}
