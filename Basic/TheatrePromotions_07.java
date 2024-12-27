package LabBasic;

import java.util.Scanner;

public class TheatrePromotions_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String typeDay = scanner.nextLine();
        int age = Integer.parseInt(scanner.nextLine());
        int price = 0;

        if (0 <= age && age <= 18){
            if (typeDay.equals("Weekday")){
                price = 12;
            } else if (typeDay.equals("Weekend")) {
                price = 15;
            } else if (typeDay.equals("Holiday")) {
                price = 5;
            }
        } else if (18 < age && age <=64) {
            if (typeDay.equals("Weekday")){
                price = 18;
            } else if (typeDay.equals("Weekend")) {
                price = 20;
            } else if (typeDay.equals("Holiday")) {
                price = 12;
            }
        } else if (64 < age && age <= 122) {
            if (typeDay.equals("Weekday")){
                price = 12;
            } else if (typeDay.equals("Weekend")) {
                price = 15;
            } else if (typeDay.equals("Holiday")) {
                price = 10;
            }
        }
        if (price != 0 ){
            System.out.printf("%d$", price);
        }else{
            System.out.println("Error!");
        }


    }
}
