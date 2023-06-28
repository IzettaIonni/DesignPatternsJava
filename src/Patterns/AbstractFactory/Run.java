package Patterns.AbstractFactory;

public class Run {
    public static void main(String[] Args) {

        //Abstract Fabric
        System.out.println(FactoryProvider.chooseFactory("one").createObject().getClass());
        System.out.println(FactoryProvider.chooseFactory("two").createObject().getClass());

    }
}
