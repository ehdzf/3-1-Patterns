package command_pattern.domain.vehicles;

import command_pattern.domain.interfaces.Vehicle;

public class Bicycle implements Vehicle {
    private final String brand;

    public Bicycle( String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Bicyle{" +
                "brand='" + brand + '\'' +
                '}';
    }

    @Override
    public void start() {
        System.out.println("pedaling...");
    }

    @Override
    public void accelerate() {
        System.out.println("pedaling harder...");
    }

    @Override
    public void stop() {
        System.out.println("stopping...");
    }

}
