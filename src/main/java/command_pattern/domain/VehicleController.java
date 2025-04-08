package command_pattern.domain;

import command_pattern.domain.commands.AccelerateCommand;
import command_pattern.domain.commands.StartCommand;
import command_pattern.domain.commands.StopCommand;
import command_pattern.domain.interfaces.Vehicle;
import command_pattern.domain.interfaces.VehicleCommand;

public class VehicleController {
    private final Vehicle vehicle;

    public VehicleController(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    private void execute(VehicleCommand command) {
        new VehicleCommandInvoker().setCommand(command).execute();
    }

    public void start() {
        StartCommand startCommand = new StartCommand(vehicle);
        execute(startCommand);
    }


    public void accelerate() {
        AccelerateCommand accelerateCommand = new AccelerateCommand(vehicle);
        execute(accelerateCommand);
    }

    public void stop() {
        StopCommand command = new StopCommand(vehicle);
        execute(command);
    }

}
