package ExerciseArrays;

import java.util.Scanner;

public class ArrayRotation_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] array = scanner.nextLine().split(" ");
        int numOfRotations = Integer.parseInt(scanner.nextLine());

        // 1.При всяка ротация вземаме 1я елемент
        for (int rotation = 1; rotation <= numOfRotations; rotation++) {
            String firstEl = array[0];
            // 2. Обхождаме масива и придърпваме на ляво с един елемент
            for (int position = 0; position < array.length - 1; position++) {
                array[position] = array[position + 1];


            }
             // 3. Поставяме първия елемент на последна позиция
            array[array.length - 1] = firstEl;


        }
        // 4. Принтираме всеки елемент
        for (String el : array) {
            System.out.print(el + " ");

        }



    }
}
