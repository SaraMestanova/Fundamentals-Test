package ExerciseArrays;

import java.util.Scanner;

public class CommonElements_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String firstRow = scanner.nextLine();
        String secondRow = scanner.nextLine();

        String[] firstArr = firstRow.split(" ");
        String[] secondArr = secondRow.split(" ");

        for (String element2 : secondArr){
            for (String element1: firstArr){
                if (element2.equals(element1)){
                    System.out.print(element2 + " ");
                }
            }
        }
    }
}
