package command_pattern.application;

import command_pattern.domain.VehicleController;
import command_pattern.domain.interfaces.Vehicle;

import java.util.ArrayList;
import java.util.List;

public class Garage {
    private final List<Vehicle> vehicles = new ArrayList<>();

    public Garage() {}

    public void addGarageVehicle(Vehicle vehicle) {
        vehicles.add(vehicle);
    }

    public void testAllVehicles() {
        for (Vehicle vehicle : vehicles) {
            System.out.println("Testing vehicle: " + vehicle);
            VehicleController controller = new VehicleController(vehicle);
            controller.start();
            controller.accelerate();
            controller.stop();
            System.out.println(" ==========================");
        }
    }


}
