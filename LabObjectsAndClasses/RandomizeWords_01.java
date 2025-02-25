package LabObjectsAndClasses;

import java.util.Random;
import java.util.Scanner;

public class RandomizeWords_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] word = scanner.nextLine().split(" ");
        Random random = new Random();

        for (int i = 0; i < word.length; i++) {
            int rndIndexX = random.nextInt(word.length - 1);
            int rndIndexY = random.nextInt(word.length - 1);

            String oldWord = word[rndIndexX];
            word[rndIndexX] = word[rndIndexY];
            word[rndIndexY] = oldWord;
        }
        System.out.println(String.join(System.lineSeparator(), word));

    }
}
