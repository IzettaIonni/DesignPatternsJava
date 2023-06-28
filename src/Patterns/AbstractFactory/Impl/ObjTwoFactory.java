package Patterns.AbstractFactory.Impl;

import Patterns.AbstractFactory.AbstractFactory;

public class ObjTwoFactory implements AbstractFactory<ObjTwo> {

    @Override
    public ObjTwo createObject() {
        return new ObjTwo("asd");
    }

}
