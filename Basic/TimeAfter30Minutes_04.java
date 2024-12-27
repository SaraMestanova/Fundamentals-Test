package LabBasic;

import java.util.Scanner;

public class TimeAfter30Minutes_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int currentHour = Integer.parseInt(scanner.nextLine());
        int currentMin = Integer.parseInt(scanner.nextLine());

        int totalMin = currentHour * 60 + currentMin + 30;

        int finalHour = totalMin / 60;
        int finalMin = totalMin % 60;

        if (finalHour > 23){
            finalHour = 0;
        }
        System.out.printf("%d:%02d", finalHour, finalMin);
    }
}
