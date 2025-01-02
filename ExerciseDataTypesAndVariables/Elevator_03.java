package ExerciseDataTypesAndVariables;

import java.util.Scanner;

public class Elevator_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numOfPeople = Integer.parseInt(scanner.nextLine());
        int capacityOfPeople = Integer.parseInt(scanner.nextLine());

        double courses = Math.ceil(numOfPeople * 1.0 / capacityOfPeople);
        System.out.printf("%.0f", courses);

    }
}
