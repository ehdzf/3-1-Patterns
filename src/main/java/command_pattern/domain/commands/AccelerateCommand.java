package command_pattern.domain.commands;

import command_pattern.domain.interfaces.Vehicle;
import command_pattern.domain.interfaces.VehicleCommand;

public class AccelerateCommand implements VehicleCommand {
    private final Vehicle vehicle;

    public AccelerateCommand(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    @Override
    public void execute() {
        vehicle.accelerate();
    }


}
