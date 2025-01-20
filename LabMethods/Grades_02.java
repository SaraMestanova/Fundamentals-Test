package LabMethods;

import java.util.Scanner;

public class Grades_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double grade = Double.parseDouble(scanner.nextLine());
        kindGrade(grade);
    }

    private static void kindGrade(double grade) {
        //Fail 2.00- 2.99
        //Poor 3.00- 3.49
        //Good 3.50- 4.49
        //Very good 4.50- 5.49
        //Excellent 5.50- 6.00
        printFail(grade);
        printPoor(grade);
        printGood(grade);
        printVeryGood(grade);
        printExcellent(grade);
    }

    private static void printFail(double grade) {
        if (grade >= 2.00 && grade <= 2.99){
            System.out.println("Fail");
        }

    }

    private static void printPoor(double grade) {
        if (grade >= 3.00 && grade <= 3.49){
            System.out.println("Poor");
        }


    }

    private static void printGood(double grade) {
        if (grade >= 3.50 && grade <= 4.49){
            System.out.println("Good");
        }

    }

    private static void printVeryGood(double grade) {
        if (grade >= 4.50 && grade <= 5.49){
            System.out.println("Very good");
        }

    }

    private static void printExcellent(double grade) {
        if (grade >= 5.50 && grade <= 6.00){
            System.out.println("Excellent");
        }

    }
























}
