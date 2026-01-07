package domain;

public class Vehicle {

    public Vehicle() {

    }

    private String make;
    private String model;
    private String year;
    private String color;
    private int numberOfDoors;

    public Vehicle(String make, String model, String year, String color, int numberOfDoors) {

        this.make = make;
        this.model = model;
        this.year = year;
        this.color = color;
        this.numberOfDoors = numberOfDoors;

    }

    // Getters
    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public String getYear() {
        return year;
    }

    public String getColor() {
        return color;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    //Stters
    public void setMake(String make) {
        this.make = make;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }
}
