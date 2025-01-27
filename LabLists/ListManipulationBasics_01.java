package LabLists;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListManipulationBasics_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        List<Integer> numbers = Arrays.stream(input.split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        String command = scanner.nextLine();

        while (!command.equals("end")){


            String[] splitTheCommand = command.split(" ");
            String commandName = splitTheCommand[0];

            switch (commandName){
                case "Add":
                    int numToAdd = Integer.parseInt(splitTheCommand[1]);
                    numbers.add(numToAdd);
                    break;
                case "Remove":
                    int numToRemove = Integer.parseInt(splitTheCommand[1]);
                    numbers.remove(Integer.valueOf(numToRemove));
                    break;
                case "RemoveAt":
                    int numToRemoveAt = Integer.parseInt(splitTheCommand[1]);
                    numbers.remove(numToRemoveAt);
                    break;
                case "Insert":
                    int indexToInsert = Integer.parseInt(splitTheCommand[2]);
                    int numToInsert = Integer.parseInt(splitTheCommand[1]);
                    numbers.add(indexToInsert, numToInsert);
                    break;
            }

            command = scanner.nextLine();

        }
        for (Integer number : numbers) {
            System.out.print(number + " ");
        }
    }
}
