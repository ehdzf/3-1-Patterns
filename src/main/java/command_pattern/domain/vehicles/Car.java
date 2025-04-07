package command_pattern.domain.vehicles;

import command_pattern.domain.interfaces.Vehicle;

public class Car implements Vehicle {
    private final String brand;

    public Car(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                '}';
    }

    @Override
    public void start() {
        System.out.println("starting engine...");
    }

    @Override
    public void accelerate() {
        System.out.println("let the pedal meet the metal!");
    }

    @Override
    public void stop() {
        System.out.println("pushing break pedal...");
    }

}
