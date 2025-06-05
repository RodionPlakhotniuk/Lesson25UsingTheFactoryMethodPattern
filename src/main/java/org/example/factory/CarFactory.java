package org.example.factory;

import org.example.transport.Car;
import org.example.transport.Transport;

public class CarFactory extends TransportFactory {
    @Override
    public Transport createTransport() {
        return new Car();
    }
}
