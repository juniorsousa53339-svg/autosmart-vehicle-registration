package domain;

public class VehiclePrinter {

    public static void printVehicleReport( Vehicle vehicle , String make , String model , String color, int year, int numberOfDoors ) {

        System.out.println("\n=====================================");
        System.out.println("          VEHICLE REPORT");
        System.out.println("=====================================");
        System.out.println("Make            : " + make            );
        System.out.println("Model           : " + model           );
        System.out.println("Color           : " + color           );
        System.out.println("Year            : " + year            );
        System.out.println("Number of Doors : " + numberOfDoors   );
        System.out.println("=====================================\n");
    }
}
