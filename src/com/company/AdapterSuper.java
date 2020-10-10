package com.company;

public class AdapterSuper implements Adapter {
    Car car;

    public AdapterSuper(Car car){
        this.car = car;
    }

    @Override
    public double speed() {
        if (car.getManufacturer().country().equals("US")){
            return converter(car.getSpeed());
        }
        return car.getSpeed();
    }

    public double converter(double speed){
        return speed * 1.609344;
    }
}
