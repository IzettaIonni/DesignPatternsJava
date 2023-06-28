package Patterns.FabricMethod2;

public interface Transport {

    void loadPackage(Package Package pack);

    Package unloadPackage();

    void move();

}
