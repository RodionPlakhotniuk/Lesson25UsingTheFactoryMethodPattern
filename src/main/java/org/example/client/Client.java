package org.example.client;

import org.example.factory.CarFactory;
import org.example.factory.PlaneFactory;
import org.example.factory.TransportFactory;

public class Client {
    public void run() {
        TransportFactory carFactory = new CarFactory();
        TransportFactory planeFactory = new PlaneFactory();

        carFactory.createTransport().move();
        planeFactory.createTransport().move();
    }
}
