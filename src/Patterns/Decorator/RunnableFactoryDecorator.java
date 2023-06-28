package Patterns.Decorator;

public class RunnableFactoryDecorator implements RunnableFactory{

    private final RunnableFactory delegate;

    public RunnableFactoryDecorator(RunnableFactory delegate) {
        this.delegate = delegate;
    }

    @Override
    public Runnable produce(String routeId) {
        var x = delegate.produce(routeId);
        return new Decorator(x);
    }
}
