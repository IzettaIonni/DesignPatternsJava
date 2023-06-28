package Patterns.Prototype;

public class ObjTwo implements Cloneable {
    private Integer a;
    private String b;

    public ObjTwo() {
        a = 20;
        b = "Not Copy Me";
    }

    public ObjTwo(Integer a, String b) {
        this.a = a;
        this.b = b;
    }

    public void setA(Integer a) {
        this.a = a;
    }

    public void setB(String b) {
        this.b = b;
    }

    public Integer getA() {
        return a;
    }

    public String getB() {
        return b;
    }

    @Override
    public String toString() {
        return "parameter a is: " + a.toString() + ", parameter b is: \"" + b + "\"";
    }

    @Override
    public ObjTwo clone() {
        return new ObjTwo(a, b);
    }
}
