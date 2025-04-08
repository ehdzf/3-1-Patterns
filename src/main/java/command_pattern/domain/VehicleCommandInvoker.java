package command_pattern.domain;

import command_pattern.domain.interfaces.VehicleCommand;

public class VehicleCommandInvoker {
    private VehicleCommand command;

    public VehicleCommandInvoker setCommand(VehicleCommand command) {
        this.command = command;
        return this;
    }

    public void execute() {
        command.execute();
    }

}
