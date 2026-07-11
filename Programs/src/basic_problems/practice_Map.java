package basic_problems;

import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;

public class practice_Map {

    // Method of problem-1
    // public static int mostFrequent(List<Integer> input) {

    // Map<Integer, Integer> freq = new HashMap<>();
    // for (int i = 0; i < input.size(); i++) {
    // freq.put(input.get(i), freq.getOrDefault(input.get(i), 0) + 1);
    // }

    // int maxCount = 0;
    // int whichKey = 0;
    // for (Map.Entry<Integer, Integer> entry : freq.entrySet()) {
    // if (entry.getValue() > maxCount) {
    // maxCount = entry.getValue();
    // whichKey = entry.getKey();
    // }
    // }
    // return whichKey;

    // }

    // Method of problem-2
    public static int[] twoSum(List<Integer> input, int target) {
        Map<Integer, Integer> seen = new HashMap<>();

        for (int i = 0; i < input.size(); i++) {
            int current = input.get(i);
            int complement = target - current;

            if(seen.containsKey(complement)){
                return new int[] {seen.get(complement), i};
            }
            seen.put(current, i);
        }
        return new int[] {};
    }

    public static void main(String[] args) {

        // Problem 1 — Easy: "Find the Most Frequent Element"
        // Problem Statement:
        // You are given a List<Integer>. Write a method that returns the element that
        // appears the most number of times. If there is a tie, return any one of them.
        // List<Integer> input = new ArrayList<>(List.of(3, 1, 4, 1, 5, 3, 3));
        // System.out.println("Most Frequent: " + mostFrequent(input));

        // Problem 2 — Easy-Medium: "Two Sum"
        // Problem Statement:
        // You are given a List<Integer> and a target integer. Write a method that
        // returns the indices of the two numbers that add up to the target. You may
        // assume exactly one solution exists.
        List<Integer> input = new ArrayList<>(List.of(2,7,11,15));
        int[] result = twoSum(input, 9);
        System.out.println("Indices: ["+result[0]+", "+result[1]+"]");


    }

}
