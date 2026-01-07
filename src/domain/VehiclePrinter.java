package domain;

public class VehiclePrinter {

    public static void printVehicleReport(Vehicle vehicle) {

        System.out.println();
        System.out.println("=====================================");
        System.out.println("          VEHICLE REPORT");
        System.out.println("=====================================");
        System.out.println("Make            : " + vehicle.getMake());
        System.out.println("Model           : " + vehicle.getModel());
        System.out.println("Color           : " + vehicle.getColor());
        System.out.println("Year            : " + vehicle.getYear());
        System.out.println("Number of Doors : " + vehicle.getNumberOfDoors());
        System.out.println("=====================================");
    }
}
