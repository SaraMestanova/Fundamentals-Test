package LabLists;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListManipulationAdvanced_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        String command = scanner.nextLine();

        while (!command.equals("end")) {
            String commandElements[] = command.split(" ");
            String commandName = commandElements[0];

            switch (commandName) {
                case "Contains":
                    int numToCheck = Integer.parseInt(commandElements[1]);
                    if (numbers.contains(numToCheck)) {
                        System.out.println("Yes");
                    } else {
                        System.out.println("No such number");
                    }
                    break;
                case "Print":
                    String commandSecondName = commandElements[1];
                    if (commandSecondName.equals("even")) {
                        for (int number : numbers) {
                            if (number % 2 == 0) {
                                System.out.print(number + " ");
                            }
                        }
                        System.out.println();
                    } else if (commandSecondName.equals("odd")) {
                        for (int number : numbers) {
                            if (number % 2 != 0) {
                                System.out.print(number + " ");
                            }
                        }
                        System.out.println();
                    }
                    break;
                case "Get":
                    int sum = 0;
                    for (int number : numbers) {
                        sum += number;
                    }
                    System.out.println(sum);
                    break;
                case "Filter":
                    int numberForChecking = Integer.parseInt(commandElements[2]);
                    String sign = commandElements[1];
                    if (sign.equals(">")) {
                        for (Integer number : numbers) {
                            if (number > numberForChecking) {
                                System.out.print(number + " ");
                            }
                        }
                        System.out.println();
                    } else if (sign.equals(">=")) {
                        for (Integer number : numbers) {
                            if (number >= numberForChecking) {
                                System.out.print(number + " ");
                            }
                        }
                        System.out.println();
                    } else if (sign.equals("<")) {
                        for (Integer number : numbers) {
                            if (number < numberForChecking) {
                                System.out.print(number + " ");
                            }
                        }
                        System.out.println();
                    } else if (sign.equals("<=")) {
                        for (Integer number : numbers) {
                            if (number <= numberForChecking) {
                                System.out.print(number + " ");
                            }
                        }
                        System.out.println();
                    }


                break;

            }
            command = scanner.nextLine();
        }

    }
}


