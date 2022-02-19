package abstraction;

public class DemoConsumer extends DemoAbstractClass {
    @Override
    public void m1() {
      System.out.println("This is implemented M1 Method");
    }

    public static void main(String[] args) {
        DemoConsumer obj= new DemoConsumer();
        obj.m1();

    }
}
