package ExerciseLists;

import javax.imageio.metadata.IIOMetadataFormatImpl;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class HouseParty_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfCommands = Integer.parseInt(scanner.nextLine());
        List<String > guests = new ArrayList<>();
        for (int i = 0; i < numberOfCommands; i++) {
            String command = scanner.nextLine();
            String[] commandParts = command.split(" ");
            String guestName = commandParts[0];
            if (command.contains("not")) {
                if (guests.contains(guestName)) {
                    guests.remove(guestName);
                } else {
                    System.out.printf("%s is not in the list!%n", guestName);
                }
            } else if (guests.contains(guestName)) {
                System.out.printf("%s is already in the list!%n", guestName);
            } else {
                guests.add(guestName);
            }

        }
        for (String name : guests) {
            System.out.println(name);
        }
    }

}
