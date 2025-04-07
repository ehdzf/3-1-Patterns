package command_pattern.domain.vehicles;

import command_pattern.domain.interfaces.Vehicle;

public class Plane implements Vehicle {
    private final String brand;

    public Plane(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Plane{" +
                "brand='" + brand + '\'' +
                '}';
    }

    @Override
    public void start() {
        System.out.println("performing takeoff maneuvers...");
    }

    @Override
    public void accelerate() {
        System.out.println("increasing flight speed...");
    }

    @Override
    public void stop() {
        System.out.println("landing the plane...");
    }

}
