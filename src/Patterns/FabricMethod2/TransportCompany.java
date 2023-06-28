package Patterns.FabricMethod2;

public abstract class TransportCompany {

    public void deliverPackage(Package pack) {
        var transport = getTransport();
        transport.loadPackage(pack);
        transport.move();
        transport.unloadPackage();
    }

    abstract protected Transport getTransport();
}
