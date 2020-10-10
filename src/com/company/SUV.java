package com.company;

public class SUV extends Car{
    public SUV(String car, Manufacturer manufacturer, double speed) {
        super(car, manufacturer, speed);
    }

    @Override
    public String getCar() {
        return car;
    }

    @Override
    public Manufacturer getManufacturer() {
        return manufacturer;
    }

    @Override
    public double getSpeed() {
        return speed;
    }
}
