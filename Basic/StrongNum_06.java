package LabExercise;

import java.util.Scanner;

public class StrongNum_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());
        int startNum = num;
        int sumFactorial = 0;

        
        while (num > 0){
          
            int lastDigit = num % 10;
            
            int factorial = 1;
            for (int i = 1; i <= lastDigit; i++) {
                factorial = factorial * i;
            }
            
            sumFactorial += factorial;
           
            num = num / 10;

        }
       

        if (startNum == sumFactorial){
            System.out.println("yes");
        }else{
            System.out.println("no");
        }
       
        
        
    }
}
