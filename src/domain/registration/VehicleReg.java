package domain.registration;

import domain.Vehicle;
import domain.VehiclePrinter;
import domain.registration.config.ConfigVehicle;

import java.util.Scanner;

public class VehicleReg {

    public void registerVehicle(Object o) {

        Scanner input = new Scanner(System.in);
        ConfigVehicle configVehicle = new ConfigVehicle();
        VehiclePrinter printer = new VehiclePrinter();

        System.out.println("\nWelcome to AutoSmart!");
        System.out.print("\nHow many cars would you like to register? ");
        int cars = input.nextInt();
        input.nextLine(); // clear buffer

        for (int i = 0; i < cars; i++) {

            Vehicle v = new Vehicle();

            System.out.printf("\nEnter details for car %d:\n", i + 1);

            /// MAKE
            String make;
            while (true) {
                System.out.print("What is the vehicle's make? ");
                make = input.nextLine();

                if (configVehicle.validateMake(make)) {
                    break;
                } else {
                    System.out.println("\nInvalid make. Please try again.");
                }
            }
            v.setMake(make);

            /// MODEL
            String model;
            while (true) {
                System.out.print("What is the vehicle's model? ");
                model = input.nextLine();

                if (configVehicle.validateModel(model)) {
                    break;
                } else {
                    System.out.println("\nInvalid model. Please try again.");
                }
            }
            v.setModel(model);

            /// YEAR
            String year;
            while (true) {
                System.out.print("What is the vehicle's year? ");
                year = input.nextLine();

                if (configVehicle.validateYear(year)) {
                    break;
                } else {
                    System.out.println("\nInvalid year. Please enter a 4-digit year.");
                }
            }
            v.setYear(year);

            /// COLOR
            String color;
            while (true) {
                System.out.print("What is the vehicle's color? ");
                color = input.nextLine();

                if (configVehicle.validateColor(color)) {
                    break;
                } else {
                    System.out.println("\nInvalid color. Please try again.");
                }
            }
            v.setColor(color);

            /// NUMBER OF DOORS
            int doors;
            while (true) {
                System.out.print("How many doors does your vehicle have? ");
                doors = input.nextInt();
                input.nextLine(); // clear buffer

                if (configVehicle.validateNumDoors(doors)) {
                    break;
                } else {
                    System.out.println("\nInvalid number of doors. Please try again.");
                }
            }
            v.setNumberOfDoors(doors);

            /// PRINT REPORT
            printer.printVehicleReport(v);
        }

        input.close();
    }
}
