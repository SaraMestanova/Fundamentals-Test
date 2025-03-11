package ExerciseTextProcessing;

import java.util.Scanner;

public class StringExplosion_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        StringBuilder text = new StringBuilder(input);

        int totalStrength = 0;

        for (int i = 0; i < text.length(); i++) {
            char currentSymbol = text.charAt(i);

            if (currentSymbol == '>'){
                int currentStrength = Integer.parseInt(text.charAt(i + 1) + "");
                totalStrength += currentStrength;
            }else if (totalStrength > 0){
                text.deleteCharAt(i);
                totalStrength--;
                i--;
            }
        }
        System.out.println(text);


    }
}
