package domain.registration.config;

import domain.Vehicle;

public class ConfigVehicle {

    public ConfigVehicle() {
    }

    /// Make validation
    public boolean validateMake(String make) {
        if (make == null || make.trim().isEmpty()) {
            return false;
        }

        if (make.length() < 2) {
            return false;
        }

        if (!make.matches("[A-Za-z ]+")) {
            return false;
        }

        return true;
    }

    /// Model validation
    public boolean validateModel(String model) {
        if (model == null || model.trim().isEmpty()) {
            return false;
        }

        if (model.length() < 2) {
            return false;
        }

        if (!model.matches("[A-Za-z ]+")) {
            return false;
        }

        return true;
    }

    /// Color validation
    public boolean validateColor(String color) {
        if (color == null || color.trim().isEmpty()) {
            return false;
        }

        if (color.length() < 2) {
            return false;
        }

        if (!color.matches("[A-Za-z ]+")) {
            return false;
        }

        return true;
    }

    /// Year validation
    public boolean validateYear(String year) {
        if (year == null || year.trim().isEmpty()) {
            return false;
        }
        if (year.length() < 2) {
            return false;
        }
        if (!year.matches("[0-9]+")) {
            return false;
        }
        return true;
    }

    /// NumberOfDoors validation
    public boolean validateNumDoors(Integer numDoors) {
        return numDoors != null && numDoors >= 1 && numDoors <= 5;
    }

    public void printVehicleReport(Vehicle v) {
    }
}


