package LabExercise;

import java.util.Scanner;

public class PadawanEquipment_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double amountOfMoney = Double.parseDouble(scanner.nextLine());
        int countOfStudents = Integer.parseInt(scanner.nextLine());
        double priceForLightsabers = Double.parseDouble(scanner.nextLine());
        double priceOfRobes = Double.parseDouble(scanner.nextLine());
        double priceOfBelts = Double.parseDouble(scanner.nextLine());

        double totalPriceLightsabers = Math.ceil(countOfStudents * 1.10) * priceForLightsabers;
        double totalPriceRobes = countOfStudents * priceOfRobes;
        double totalPriceBelts = (countOfStudents - countOfStudents / 6 ) * priceOfBelts;
        double totalPriceAll = totalPriceBelts + totalPriceRobes + totalPriceLightsabers;


        if (totalPriceAll <= amountOfMoney){
            System.out.printf("The money is enough - it would cost %.2flv.", totalPriceAll);
        }else {
            double needMoney = totalPriceAll - amountOfMoney;
            System.out.printf("George Lucas will need %.2flv more.", needMoney);
        }

    }
}
