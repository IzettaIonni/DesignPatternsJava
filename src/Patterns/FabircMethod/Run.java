package Patterns.FabircMethod;

import Patterns.FabircMethod.Transport.Ship;
import Patterns.FabircMethod.Transport.Transport;
import Patterns.FabircMethod.Transport.Truck;

public class Run {
    public static void main(String[] Args) {

        //Fabric Method
        Transport truck = new Truck();
        Transport ship = new Ship();
        truck.deliver().deliveryType();
        ship.deliver().deliveryType();

    }
}
