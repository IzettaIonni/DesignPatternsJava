package Patterns.AbstractFactory.Impl;

import Patterns.AbstractFactory.AbstractFactory;

public class ObjOneFactory implements AbstractFactory<ObjOne> {
    @Override
    public ObjOne createObject() {
        return new ObjOne(5);
    }
}
