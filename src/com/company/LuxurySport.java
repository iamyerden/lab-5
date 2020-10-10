package com.company;

public class LuxurySport extends Car {
    public LuxurySport(String car, Manufacturer manufacturer, double speed) {
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
