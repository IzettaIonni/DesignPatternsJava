package Patterns.Adapter.Client;

import Patterns.Adapter.Adaptable.IntegerToString;
import Patterns.Adapter.Adaptable.IntegerToStringImpl;
import Patterns.Adapter.Adapter;

public class Run {

    public static void main(String[] args) {
        IntegerToString integerToString = new IntegerToStringImpl();

        //client
        AlternativeInteger altInt = new AlternativeInteger(15);


        //adapter
        Integer adaptableInt = Adapter.adaptToInt(altInt);

        //adaptable
        String stringedInt = integerToString.toString(adaptableInt);


        System.out.println(stringedInt);
    }

}
