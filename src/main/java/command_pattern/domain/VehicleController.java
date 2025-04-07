package command_pattern.domain;

import command_pattern.domain.commands.AccelerateCommand;
import command_pattern.domain.commands.StartCommand;
import command_pattern.domain.commands.StopCommand;
import command_pattern.domain.interfaces.Vehicle;
import command_pattern.domain.interfaces.VehicleCommand;

public class VehicleController {
    private final VehicleCommand startCommand;
    private final VehicleCommand accelerateCommand;
    private final VehicleCommand stopCommand;

    public VehicleController(Vehicle vehicle) {
        this.startCommand = new StartCommand(vehicle);
        this.accelerateCommand = new AccelerateCommand(vehicle);
        this.stopCommand = new StopCommand(vehicle);
    }



    public void start() {
        startCommand.execute();
    }

    public void stop() {
        stopCommand.execute();
    }

    public void accelerate() {
        accelerateCommand.execute();
    }

}
