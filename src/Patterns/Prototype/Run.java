package Patterns.Prototype;

public class Run {

    public static void main(String[] Args) {

        ObjOne one = new ObjOne();
        ObjTwo two = new ObjTwo();

        ObjOne cloneOne = one.clone();
        ObjTwo cloneTwo = two.clone();

        System.out.println("Object one is {" + one.toString() + "} and object one clone is {" + cloneOne.toString() + "}");
        System.out.println("Object two is {" + two.toString() + "} and object two clone is {" + cloneTwo.toString() + "}");

    }

}
