package LabLists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MergingLists_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> first = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> second = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> finalNumbers = new ArrayList<>();

        int minLength = Math.min(first.size(), second.size());
        for (int i = 0; i < minLength; i++) {
            finalNumbers.add(first.get(i));
            finalNumbers.add(second.get(i));
        }
        if (first.size() > second.size()) {
            finalNumbers.addAll(first.subList(minLength, first.size()));
        } else if (second.size() > first.size()) {
            finalNumbers.addAll(second.subList(minLength, second.size()));
        }
        for (Integer finalNumber : finalNumbers) {
            System.out.print(finalNumber + " ");

        }
    }
}
