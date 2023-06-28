package Patterns.FabricMethod2;

public class ShipTransportCompany extends TransportCompany{
    @Override
    protected Transport getTransport() {
        return new Ship();
    }
}
