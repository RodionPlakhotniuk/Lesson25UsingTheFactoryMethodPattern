package org.example.transport;

public class Car implements Transport {
    @Override
    public void move() {
        System.out.println("Автомобіль розпочав рух");
    }
}
