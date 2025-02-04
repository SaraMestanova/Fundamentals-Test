package ExerciseLists;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class BombNumbers_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> elements = Arrays.stream(scanner.nextLine().split(" ")).collect(Collectors.toList());
        String[] numbers = scanner.nextLine().split(" ");
        String bombNumber = numbers[0];
        int power = Integer.parseInt(numbers[1]);

        while (elements.contains(bombNumber)){
            int elementIndex = elements.indexOf(bombNumber);

            int start = elementIndex - power;
            if (start < 0){
                start = 0;
            }
            int end = elementIndex + power;
            if (end > elements.size() - 1){
                end = elements.size() - 1;
            }

            for (int index = end; index >= start; index--) {
                elements.remove(index);
            }
        }
        int sum = elements.stream().mapToInt(Integer::parseInt).sum();
        System.out.println(sum);

    }
}