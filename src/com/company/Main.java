package com.company;

public class Main {

    public static void main(String[] args) {
        Car sedan = new Sedan("Tesla Model S", new US(), 155.0);
        Car SUV = new SUV("Mercedes Benz GLS 63 AMG", new Europe(), 250.0);

        Adapter sedanAdapter = new AdapterSuper(sedan);

        System.out.println("Car: " + sedan.getCar() + "; Man:"
                + sedan.getManufacturer() + "; Speed: "
                + sedanAdapter.speed());
    }
}
