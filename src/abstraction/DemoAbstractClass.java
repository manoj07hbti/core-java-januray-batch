package abstraction;

public abstract class DemoAbstractClass {
    // Syntax : access_specifier return_type  method_name (parameter) {CODE}
    public abstract void m1();// abstract method

    public void m2(){
        System.out.println("THis is M2");
    }

    public static void main(String[] args) {

      //  DemoAbstractClass obj = new DemoAbstractClass();

      //  obj.m1();
    }
}
