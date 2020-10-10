package com.company;

public class ManufacturerSuper implements Manufacturer {
    String county;

    public ManufacturerSuper(String county) {
        this.county = county;
    }

    @Override
    public String country() {
        return county;
    }

    @Override
    public String toString() {
        return "ManufacturerSuper{" +
                "county='" + county + '\'' +
                '}';
    }
}
