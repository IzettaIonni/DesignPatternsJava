package Patterns.FabircMethod.Transport;

import Patterns.FabircMethod.Parcels.Parcel;
import Patterns.FabircMethod.Parcels.TruckParcel;

public class Truck extends Transport {

    public Parcel deliver() {
        return new TruckParcel();
    }

}
