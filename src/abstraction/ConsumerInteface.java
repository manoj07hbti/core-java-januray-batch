package abstraction;


public class ConsumerInteface implements DemoInterface {
    @Override
    public void m1() {
        System.out.println("This is implemented M1 Method");
    }

    @Override
    public void m2() {
        System.out.println("This is implemented M2 Method");
    }

    @Override
    public void m3() {
        System.out.println("This is implemented M3 Method");
    }
}
