package domain.registration;

import domain.Vehicle;
import domain.VehiclePrinter;
import domain.registration.config.ConfigVehicle;

import java.util.Scanner;

public class VehicleReg {

    public boolean registerVehicle(Object o) {

        Scanner input = new Scanner(System.in);
        ConfigVehicle configVehicle = new ConfigVehicle();
        VehiclePrinter printer = new VehiclePrinter();

        System.out.println("\nWelcome to AutoSmart!");
        System.out.print("\nHow many cars would you like to register? ");
        int cars = input.nextInt();

        // Validation cars
        while (cars < 1 || cars > 200) {
            System.out.println("Invalid input. Please try again.");
            cars = input.nextInt();
        }
        input.nextLine(); // clear buffer

        for (int i = 0; i < cars; i++) {

            Vehicle v = new Vehicle();
            System.out.printf("\nEnter details for car %d:\n", i + 1);


            // MAKE
            ConfigVehicle.ValidationMake(String.valueOf(input.nextLine()));

            // MODEL
            ConfigVehicle.ValidationModel(String.valueOf(input.nextLine()));

            // YEAR
            ConfigVehicle.ValidationYear(String.valueOf(input.nextLine()));

            // COLOR
            ConfigVehicle.ValidationColor(String.valueOf(input.nextLine()));

            // NUMBER OF DOORS
            ConfigVehicle.ValidationNumberOfDoors(input.nextInt());

            if (ConfigVehicle.isComplete() == true) {
            //VehiclePrinter.printVehicleReport();

            } else {
                System.out.println("You did not fill in all the vehicle information.");
                System.out.println("Please try again later.");
                break;
            }
            input.nextLine(); // clear buffer
        }
        input.close();
        return true;
    }
}
