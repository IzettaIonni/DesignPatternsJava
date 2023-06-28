package Patterns.Adapter.Adaptable;

public class IntegerToStringImpl implements IntegerToString{
    @Override
    public String toString(Integer number) {
        return number.toString();
    }
}
