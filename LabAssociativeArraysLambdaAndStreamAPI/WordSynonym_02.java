package LabAssociativeArraysLambdaAndStreamAPI;

import java.util.*;

public class WordSynonym_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        Map<String, List<String>> wordSynonimsMap = new LinkedHashMap<>();

        for (int count = 1; count <=  n; count++) {
            String word = scanner.nextLine();
            String synonym = scanner.nextLine();

            wordSynonimsMap.putIfAbsent(word, new ArrayList<>());

            wordSynonimsMap.get(word).add(synonym);
        }

        for (Map.Entry<String, List<String>> pair : wordSynonimsMap.entrySet()) {

            String word = pair.getKey();
            List<String> synonyms = pair.getValue();
            System.out.println(word + " - " + String.join(", ", synonyms));
        }
    }
}
