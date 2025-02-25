package ExerciseObjectsAndClasses.VehicleType;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        List<Vehicle> vehicles = new ArrayList<>();

        while (!input.equals("End")) {
            String type = input.split("\\s+")[0];
            String model = input.split("\\s+")[1];
            String color = input.split("\\s+")[2];
            int horsePower = Integer.parseInt(input.split("\\s+")[3]);
            Vehicle vehicle = new Vehicle(type, model, color, horsePower);
            vehicles.add(vehicle);
            input = scanner.nextLine();
        }

        String command = scanner.nextLine();
        while (!command.equals("Close the Catalogue")){
            for (Vehicle vehicle : vehicles) {
                if (vehicle.getModel().equals(command)) {
                    System.out.println(vehicle.toString());
                }
            }
            command = scanner.nextLine();
        }

        double sumCar = 0;
        double sumTruck = 0;
        int countCar = 0;
        int countTruck = 0;

        for (Vehicle vehicle : vehicles) {
            if (vehicle.getTypeOfVehicle().equals("car")) {
                sumCar += vehicle.getHorsePower();
                countCar++;
            } else if (vehicle.getTypeOfVehicle().equals("truck")) {
                sumTruck += vehicle.getHorsePower();
                countTruck++;
            }
        }

        double averageCars = sumCar / countCar;
        if (countCar == 0) {
            averageCars = 0;
        }
        System.out.printf("Cars have average horsepower of: %.2f.%n", averageCars);

        double averageTrucks = sumTruck / countTruck;
        if (countTruck == 0) {
            averageTrucks = 0;
        }
        System.out.printf("Trucks have average horsepower of: %.2f.%n", averageTrucks);
    }
}
