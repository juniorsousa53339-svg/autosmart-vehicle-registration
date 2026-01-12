package domain.registration.config;

import domain.Vehicle;
import domain.registration.VehicleReg;


import java.io.Serializable;
import java.util.Scanner;
import java.util.regex.Pattern;

public class ConfigVehicle {

    public ConfigVehicle() {
    }

    public void printVehicleReport(Vehicle v) {
    }

    private static final int TOTAL_FIELDS = 5;

    // counter of true values
    private static int conterTrue = 0;

    public static boolean isComplete() {

        if (conterTrue < TOTAL_FIELDS) {
            System.out.println("Error: please register the vehicle again.");
            VehicleReg newVehicleReg = new VehicleReg();
            return false;
        }
        return true;
    }

    static Scanner input = new Scanner(System.in);

    // Make Validation
    public static boolean ValidationMake(String make) {


        while (true) {
            System.out.print("What is the vehicle's make? ");
            make = (input.nextLine().trim());

            if (make.trim().isEmpty() || !make.matches("[a-zA-Z ]+")) {

                System.out.println("\nError: Make must contain only letters.");
                System.out.println(" please register the make again.\n");

            } else {
                conterTrue++;
                return true;
            }
        }
    }

    public static boolean ValidationModel(String model) {


        while (true) {
            System.out.print("What is the vehicle's model? ");
            model = (input.nextLine().trim());

            if (model.trim().isEmpty() || !model.matches("[a-zA-Z ]+")) {

                System.out.println("\nError: Model must contain only letters.");
                System.out.println("please register the make again.\n");

            } else {
                conterTrue++;
                return true;
            }
        }
    }

    public static boolean ValidationYear(String year) {


        while (true) {
            System.out.print("What is the vehicle's year? ");
            year = (input.nextLine().trim());

            if (year.isEmpty() || !year.matches("[0-50]+")) {
                System.out.println("\nError: Year must contain only letters.");
                System.out.println("please register the Year again.\n");

            } else {
                conterTrue++;
                return true;
            }
        }
    }

    public static boolean ValidationColor(String color) {

        while (true) {
            System.out.print("What is the vehicle's model color? ");
            color = (input.nextLine().trim());

            if (color.isEmpty() || !color.matches("[a-zA-Z ]+")) {
                System.out.println("\nError: Model must contain only letters.");
                System.out.println("please register the color again.\n");

            } else {
                conterTrue++;
                return true;
            }
        }
    }

    public static boolean ValidationNumberOfDoors(int numberOfDoors) {

        while (true) {
            System.out.print("What is the vehicle's number of doors? ");
            numberOfDoors = (Integer.parseInt(input.nextLine().trim()));

            if (numberOfDoors < 1 || numberOfDoors > TOTAL_FIELDS) {
                System.out.println("\nError: Number of doors must be between 1 and 5.");
                System.out.println("please register the Number of doors again.\n");

            } else {
                conterTrue++;
                return true;
            }
        }
    }

}






