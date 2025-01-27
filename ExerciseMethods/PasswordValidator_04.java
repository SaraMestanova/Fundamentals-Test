package ExerciseMethods;

import java.util.Scanner;

public class PasswordValidator_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String password = scanner.nextLine();

        //проверка дали дължината е валидна
        boolean isLengthValid = isLengthValid(password);
        if (!isLengthValid){
            System.out.println("Password must be between 6 and 10 characters");
        }
        //проверка дали се състои само от букви и цифри
        boolean isConsistValid = isConsistValid(password);
        if (!isConsistValid){
            System.out.println("Password must consist only of letters and digits");
        }
        //проверка дали има поне 2 символа
        boolean isTwoDigitsAtLeast = isTwoDigitsAtLeast(password);
        if (!isTwoDigitsAtLeast){
            System.out.println("Password must have at least 2 digits");
        }

        if (isLengthValid && isConsistValid && isTwoDigitsAtLeast) {
            System.out.println("Password is valid");
        }
    }

    private static boolean isLengthValid(String password) {
        if (password.length() >= 6 && password.length() <= 10){
            return true;
        }else{
            return false;
        }
    }

    private static boolean isConsistValid(String password) {
        for (char symbol : password.toCharArray()){
            if (!Character.isLetterOrDigit(symbol)){
                return false;
            }
        }
        return true;
    }

    private static boolean isTwoDigitsAtLeast(String password) {
        int digitCount = 0;

        for (char symbol : password.toCharArray()) {
            if (Character.isDigit(symbol)) {
                digitCount++;
            }
            if (digitCount >= 2) {
                return true;
            }
        }
        return false;

    }
}
