package LabArrays;

import java.util.Scanner;

public class DayOfWeek_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int dayNum = Integer.parseInt(scanner.nextLine());

        String[] weekDays = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};


        if (dayNum >= 1 && dayNum <= 7){
            System.out.println(weekDays[dayNum - 1]);
        }else{
            System.out.println("Invalid day!");
        }
    }
}
