package LabLists;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class RemoveNegativesAndReverse_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        numbers.removeIf(number -> number < 0);
        if (numbers.isEmpty()){
            System.out.println("empty");
        }else {
            Collections.reverse(numbers);
        }
        for (Integer number : numbers) {
            System.out.print(number + " ");
        }
    }
}
