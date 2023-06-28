package Patterns.Decorator;

public class Decorator extends Object implements Runnable {

    private final Runnable delegate;

    public Decorator(Runnable delegate) {
        this.delegate = delegate;
    }

    @Override
    public void run() {
        System.out.println("Before delegate to decorated object");
        delegate.run();
        System.out.println("After delegate to decorated object");
    }

}
