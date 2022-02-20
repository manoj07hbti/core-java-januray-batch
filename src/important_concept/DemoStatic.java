package important_concept;

public class DemoStatic {

    static int age=21;
    String name="Test";

    public static void m1(){

        System.out.println("This is static method....");
    }

    public static void main(String[] args) {

        DemoStatic.m1();
        System.out.println( DemoStatic.age);

    }
}
