package ExerciseObjectsAndClasses.VehicleType;

public class Vehicle {
    private String typeOfVehicle;
    private String model;
    private String color;
    private int horsePower;

    public Vehicle(String typeOfVehicle, String model, String color, int horsePower) {
        this.typeOfVehicle = typeOfVehicle;
        this.model = model;
        this.color = color;
        this.horsePower = horsePower;
    }

    public String getTypeOfVehicle() {
        return typeOfVehicle;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    public void setType(String type) {
        this.typeOfVehicle = type;
    }

    public String toString() {

        String vehicleType = typeOfVehicle.equals("car") ? "Car" : "Truck";
        return "Type: " + vehicleType + "\n" +
                "Model: " + model + "\n" +
                "Color: " + color + "\n" +
                "Horsepower: " + horsePower;
    }
}
