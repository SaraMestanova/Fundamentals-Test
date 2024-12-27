package LabBasic;

import java.util.Scanner;

public class EvenNum_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());
        while (num % 2 != 0){
            System.out.println("Please write an even number.");
            num = Integer.parseInt(scanner.nextLine());

        }
        int number = Math.abs(num);
        System.out.printf("The number is: %d", number);
    }
}
