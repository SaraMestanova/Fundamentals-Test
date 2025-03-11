package ExerciseAssociativeArraysLambdaAndStreamAPI;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class CountCharsInString_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<Character, Integer> counts = new LinkedHashMap<>();

        String input = scanner.nextLine();
        for (char c : input.toCharArray()) {
            if (c == ' '){
                continue;
            }
            if (counts.containsKey(c)){
                int currentCount = counts.get(c);
                counts.put(c, currentCount + 1);
            }else {
                counts.put(c, 1);
            }
        }
        for (Map.Entry<Character, Integer> entry : counts.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}
