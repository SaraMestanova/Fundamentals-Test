package LabExercise;

import java.util.Scanner;

public class Vacation_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int groupOfPeople = Integer.parseInt(scanner.nextLine());
        String typeOfTheGroup = scanner.nextLine();
        String dayOfTheWeek = scanner.nextLine();

        double priceForOne = 0;
        if (typeOfTheGroup.equals("Students")){
            if (dayOfTheWeek.equals("Friday")){
                priceForOne = 8.45;
            } else if (dayOfTheWeek.equals("Saturday")) {
                priceForOne = 9.80;
            } else if (dayOfTheWeek.equals("Sunday")) {
                priceForOne = 10.46;
            }
        } else if (typeOfTheGroup.equals("Business")) {
            if (dayOfTheWeek.equals("Friday")){
                priceForOne = 10.90;
            } else if (dayOfTheWeek.equals("Saturday")) {
                priceForOne = 15.60;
            } else if (dayOfTheWeek.equals("Sunday")) {
                priceForOne = 16;
            }
        } else if (typeOfTheGroup.equals("Regular")) {
            if (dayOfTheWeek.equals("Friday")){
                priceForOne = 15;
            } else if (dayOfTheWeek.equals("Saturday")) {
                priceForOne = 20;
            } else if (dayOfTheWeek.equals("Sunday")) {
                priceForOne = 22.50;
            }
        }

        if (typeOfTheGroup.equals("Business") && groupOfPeople >= 100) {
            groupOfPeople -= 10; // Намаляване на броя на хората
        }

        double sumPrice = priceForOne * groupOfPeople;

        if (typeOfTheGroup.equals("Students") && groupOfPeople >= 30) {
            sumPrice *= 0.85; // 15% отстъпка
        } else if (typeOfTheGroup.equals("Regular") && groupOfPeople >= 10 && groupOfPeople <= 20) {
            sumPrice *= 0.95; // 5% отстъпка
        }

        System.out.printf("Total price: %.2f", sumPrice);
    }
}
