package ExerciseLists;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ChangeList_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        String command = scanner.nextLine();

        while (!command.equals("end")) {
            String[] commandParts = command.split(" ");
            String commandName = commandParts[0];
            int firstNumber = Integer.parseInt(commandParts[1]);
            switch (commandName) {
                case "Delete":
                    numbers.removeAll(List.of(firstNumber));
                    break;
                case "Insert":
                    int secondNumber = Integer.parseInt(commandParts[2]);
                    numbers.add(secondNumber, firstNumber);
                    break;


            }
            command = scanner.nextLine();
        }
        for (Integer number : numbers) {
            System.out.print(number + " ");
        }
    }
}
