package Patterns.AbstractFactory;

import Patterns.AbstractFactory.Impl.ObjOneFactory;
import Patterns.AbstractFactory.Impl.ObjTwo;
import Patterns.AbstractFactory.Impl.ObjTwoFactory;

public class FactoryProvider {

    public static AbstractFactory chooseFactory(String choice) {

        if (choice.equalsIgnoreCase("one")) {
            return new ObjOneFactory();

        }
        if (choice.equalsIgnoreCase("two")) {
            return new ObjTwoFactory();
        }

        return null;
    }

}
