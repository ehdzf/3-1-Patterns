package command_pattern.domain.vehicles;

import command_pattern.domain.interfaces.Vehicle;

public class Ship implements Vehicle {
    private final String brand;

    public Ship(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Ship{" +
                "brand='" + brand + '\'' +
                '}';
    }

    @Override
    public void start() {
        System.out.println("setting sail...");
    }

    @Override
    public void accelerate() {
        System.out.println("increasing ship speed...");
    }

    @Override
    public void stop() {
        System.out.println("docking the ship...");
    }

}
