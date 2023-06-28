package Patterns.Adapter;

import Patterns.Adapter.Client.AlternativeInteger;

public class Adapter {

    public static Integer adaptToInt(AlternativeInteger altInt) {
        return (altInt.get());
    }

}
