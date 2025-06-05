package org.example.factory;

import org.example.transport.Plane;
import org.example.transport.Transport;

public class PlaneFactory extends TransportFactory {
    @Override
    public Transport createTransport() {
        return new Plane();
    }
}
