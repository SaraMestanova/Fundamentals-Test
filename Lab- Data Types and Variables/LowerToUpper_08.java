package LabDataTypesandVariables;

import java.util.Scanner;

public class LowerToUpper_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char one = scanner.nextLine().charAt(0);

        if (one > 96){
            System.out.println("lower-case");
        }else {
            System.out.println("upper-case");
        }
    }
}
