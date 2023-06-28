package Patterns.Adapter.Client;

public class AlternativeInteger {

    private int value;

    AlternativeInteger(int value) {
        this.value = value;
    }

    public int get() {
        return value;
    }

    public void set(int value) {
        this.value = value;
    }
}
