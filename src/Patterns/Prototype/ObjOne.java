package Patterns.Prototype;

public class ObjOne implements Cloneable {

    private Integer a;
    private String b;


    public ObjOne() {
        a = 10;
        b = "Copy Me";
    }
    public ObjOne(Integer a, String b) {
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
    public ObjOne clone() {
        return new ObjOne(a, b);
    }
}
