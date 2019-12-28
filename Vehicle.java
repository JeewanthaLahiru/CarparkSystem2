package com.company;

public abstract class Vehicle {
    private String idplate;
    private String brand;
    private String time;

    public Vehicle(String idplate, String brand, String time) {
        this.idplate = idplate;
        this.brand = brand;
        this.time = time;
    }

    public Vehicle() {
    }

    public String getIdplate() {
        return idplate;
    }

    public void setIdplate(String idplate) {
        this.idplate = idplate;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
