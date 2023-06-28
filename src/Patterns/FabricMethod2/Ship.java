package Patterns.FabricMethod2;

public class Ship implements Transport{

    private Package pack;

    @Override
    public void loadPackage(Package pack) {
        if(this.pack != null) {
            throw new NullPointerException();
        }

        this.pack = pack;
    }

    @Override
    public Package unloadPackage() {
        if (this.pack == null) {
            throw new NullPointerException();
        }

        var unloadPack = pack;
        pack = null;
        return unloadPack;
    }

    @Override
    public void move() {

    }
}
