package command_pattern;

import command_pattern.application.Garage;
import command_pattern.domain.interfaces.Vehicle;
import command_pattern.domain.vehicles.Bicycle;
import command_pattern.domain.vehicles.Car;
import command_pattern.domain.vehicles.Plane;
import command_pattern.domain.vehicles.Ship;

public class Main {
    public static void main(String[] args) {
        Vehicle[] vehicles = {new Bicycle("Cannondale"),
        new Car("Ford"),
        new Ship("Bertram"),
        new Plane("Airbus")};
        Garage garage = new Garage();

        for (Vehicle vehicle : vehicles) {
            garage.addGarageVehicle(vehicle);
        }

        garage.testAllVehicles();



    }
}
