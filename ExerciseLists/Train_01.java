package ExerciseLists;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Train_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> wagonsCapacity = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        int maxCapacity = Integer.parseInt(scanner.nextLine());
        String command = scanner.nextLine();

        while (!command.equals("end")){
            String[] commandParts = command.split(" ");
            if (command.startsWith("Add")){
                int passengers = Integer.parseInt(commandParts[1]);
                wagonsCapacity.add(passengers);
            }else {
                int passengers = Integer.parseInt(commandParts[0]);
                for (int i = 0; i < wagonsCapacity.size(); i++) {
                    int freeSpace = maxCapacity - wagonsCapacity.get(i);
                    if (freeSpace >= passengers) {
                        wagonsCapacity.set(i, wagonsCapacity.get(i) + passengers);
                        break;
                    }
                }
            }
            command = scanner.nextLine();

        }
        for (Integer wagonCapacity : wagonsCapacity) {
            System.out.print(wagonCapacity + " ");
        }


    }

}
