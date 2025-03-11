package ExerciseRegularExpressions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StarEnigma_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int messageCount = Integer.parseInt(scanner.nextLine());


        List<String> attackedPlanets = new ArrayList<>();
        int attackedPlanetCount = 0;
        List<String> destroyedPlanets = new ArrayList<>();
        int destroyedPlanetCount = 0;

        for (int message = 0; message < messageCount; message++) {
            StringBuilder decryptedMessage = new StringBuilder();
            int letterCount = 0;
            String input = scanner.nextLine();
            for (char symbol : input.toCharArray()) {
                if ("starSTAR".indexOf(symbol) >= 0) {
                    letterCount++;
                }
            }
            for (char symbol : input.toCharArray()) {
                decryptedMessage.append((char) (symbol - letterCount));
            }
            String regex = "@(?<planetName>[A-Za-z]+)[^@!:>-]*:(?<population>[0-9]+)!(?<attackType>[AD])![^@!:>-]*->(?<soldierCount>[0-9]+)";
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(decryptedMessage);
            if (matcher.find()) {
                String planetName = matcher.group("planetName");
                String attackType = matcher.group("attackType");

                if (attackType.equals("A")) {
                    attackedPlanets.add(planetName);
                } else {
                    destroyedPlanets.add(planetName);
                }
            }

        }
        Collections.sort(attackedPlanets);
        Collections.sort(destroyedPlanets);

        System.out.printf("Attacked planets: %d%n", attackedPlanets.size());
        for (String planet : attackedPlanets) {
            System.out.printf("-> %s%n", planet);
        }

        System.out.printf("Destroyed planets: %d%n", destroyedPlanets.size());
        for (String planet : destroyedPlanets) {
            System.out.printf("-> %s%n", planet);
        }
    }
}
