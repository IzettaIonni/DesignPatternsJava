package Patterns.FabircMethod.Transport;

import Patterns.FabircMethod.Parcels.Parcel;
import Patterns.FabircMethod.Parcels.ShipParcel;

public class Ship extends Transport {

    public Parcel deliver() {
        return new ShipParcel();
    }

}
