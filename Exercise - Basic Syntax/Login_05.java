package LabExercise;

import java.util.Scanner;

public class Login_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String username = scanner.nextLine();

        String password = "";

        for (int position = username.length() - 1 ; position >= 0; position--) {
            char currentPosition = username.charAt(position);
            password = password + currentPosition;
        }
        String enteredPass = scanner.nextLine();

        int countWrong = 0;
        while (!enteredPass.equals(password)){
            countWrong++;

            if (countWrong == 4){
                System.out.printf("User %s blocked!", username);
                return;
            }
            System.out.println("Incorrect password. Try again.");


            enteredPass = scanner.nextLine();
        }
        System.out.printf("User %s logged in.", username);
    }
}
