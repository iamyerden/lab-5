package com.company;

public abstract class Car {
    String car;
    Manufacturer manufacturer;
    double speed;

    public Car(String car, Manufacturer manufacturer, double speed) {
        this.manufacturer = manufacturer;
        this.speed = speed;
        this.car = car;
    }

    abstract public String getCar();
    abstract public Manufacturer getManufacturer();
    abstract public double getSpeed();
}
