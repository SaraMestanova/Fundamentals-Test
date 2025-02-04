package ExerciseLists;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListOperations_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        String command = scanner.nextLine();
        while (!command.equals("End")){
            String commandName = command.split(" ")[0];
            switch (commandName){
                case "Add":
                    getAdd(numbers, command);
                    break;
                case "Insert":
                    getInsert(numbers, command);
                    break;
                case "Remove":
                    getRemove(numbers, command);
                    break;
                case "Shift":
                    getLeft(numbers, command);
                    getRight(numbers, command);
            }
            command = scanner.nextLine();
        }
        for (Integer number : numbers) {
            System.out.print(number + " ");
        }

    }

    private static void getAdd(List<Integer> numbers, String command) {
        int firstNum = Integer.parseInt(command.split(" ")[1]);
        numbers.add(firstNum);
    }

    private static void getInsert(List<Integer> numbers, String command) {
        int element = Integer.parseInt(command.split(" ")[1]);
        int index = Integer.parseInt(command.split(" ")[2]);
        if (index >= 0 && index <= numbers.size()) {
            numbers.add(index, element);
        } else {
            System.out.println("Invalid index");
        }
    }

    private static void getRemove(List<Integer> numbers, String command) {
        int index = Integer.parseInt(command.split(" ")[1]);
        if (index >= 0 && index <= numbers.size()) {
            numbers.remove(index);
        } else {
            System.out.println("Invalid index");
        }
    }

    private static void getLeft(List<Integer> numbers, String command) {
        String secondName = command.split(" ")[1];
        if (secondName.equals("left")){
            int shiftLeftCount = Integer.parseInt(command.split(" ")[2]);
            for (int i = 1; i <= shiftLeftCount ; i++) {
                int firstElement = numbers.getFirst();
                numbers.add(firstElement);
                numbers.remove(0);
            }

        }
    }

    private static void getRight(List<Integer> numbers, String command) {
        String secondName = command.split(" ")[1];
        if (secondName.equals("right")){
            int shiftRightCount = Integer.parseInt(command.split(" ")[2]);
            for (int i = 1; i <= shiftRightCount; i++) {

                int lastElement = numbers.getLast();
                numbers.add(0, lastElement);
                numbers.remove(numbers.size() - 1);

            }

        }
    }

}
