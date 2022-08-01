package org.aibles.javatraining.SpringDemo.entities;

public class Car {
    private long id;
    private String brand;
    private String color;
    private int seatNumber;

    public Car(long id, String brand, String color, int seatNumber) {
        this.id = id;
        this.brand = brand;
        this.color = color;
        this.seatNumber = seatNumber;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(int seatNumber) {
        this.seatNumber = seatNumber;
    }
}
