package LabExercise;

import java.util.Scanner;

public class StrongNum_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());
        int startNum = num;
        int sumFactorial = 0;

        // while цикъл, докато числото не е по- малко или равно на 0
        while (num > 0){
            // 1. взимаме последната цифра като делим % на 10 защото устатъка е последната цифра
            int lastDigit = num % 10;
            // 2. намираме факториела на тази цифра, с фор цикъл
            int factorial = 1;
            for (int i = 1; i <= lastDigit; i++) {
                factorial = factorial * i;
            }
            // 3. добавяме факториела на цифрата към общия факториел
            sumFactorial += factorial;
            // 4. премахваме последната цифра
            num = num / 10;

        }
        // проверяваме дали е силно числото

        if (startNum == sumFactorial){
            System.out.println("yes");
        }else{
            System.out.println("no");
        }
       
        
        
    }
}
