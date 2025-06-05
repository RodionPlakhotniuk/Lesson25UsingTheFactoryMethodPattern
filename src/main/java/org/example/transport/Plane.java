package org.example.transport;

public class Plane implements Transport {
    @Override
    public void move() {
        System.out.println("Літак розпочав рух");
    }
}
