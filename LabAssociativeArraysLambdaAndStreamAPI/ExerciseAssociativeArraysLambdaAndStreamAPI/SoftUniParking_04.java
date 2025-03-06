package ExerciseAssociativeArraysLambdaAndStreamAPI;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class SoftUniParking_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfCommands = Integer.parseInt(scanner.nextLine());

        Map<String, String> license = new LinkedHashMap<>();

        for (int i = 0; i < numberOfCommands; i++) {
            String command = scanner.nextLine();

            if (command.startsWith("register")){
                String username = command.split(" ")[1];
                String plateNumber = command.split(" ")[2];
                if (license.containsKey(username)){
                    System.out.printf("ERROR: already registered with plate number %s%n", plateNumber);
                }else {
                    license.put(username, plateNumber);
                    System.out.printf("%s registered %s successfully%n", username, plateNumber);
                }

            } else if (command.startsWith("unregister")) {
                String username = command.split(" ")[1];
                if (license.containsKey(username)) {
                    license.remove(username);
                    System.out.println(String.format("%s unregistered successfully", username));
                } else {
                    System.out.printf("ERROR: user %s not found%n", username);
                }
            }

        }
        license.forEach((key, value) -> System.out.printf("%s => %s%n", key, value));
    }
}
