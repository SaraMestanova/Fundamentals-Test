package LabAssociativeArraysLambdaAndStreamAPI;

import java.util.*;

public class OddOccurrences_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] inputs = scanner.nextLine().split("\\s+");

        Map<String, Integer> occurrences = new LinkedHashMap<>();

        for (String input : inputs) {
            input = input.toLowerCase();

            occurrences.putIfAbsent(input, 0);
            occurrences.put(input, occurrences.get(input) + 1);

        }
        List<String> resultList = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : occurrences.entrySet()) {
            if (entry.getValue() % 2 != 0) {
                resultList.add(entry.getKey());
            }
        }
        System.out.println(String.join(", ", resultList));
    }
}
