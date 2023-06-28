package Patterns.FabricMethod2;

public class TruckTransportCompany extends TransportCompany{


    @Override
    protected Transport getTransport() {
        return Truck();
    }
}
