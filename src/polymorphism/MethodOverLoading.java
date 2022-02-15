package polymorphism;

public class MethodOverLoading {

   //Same method with different input parameter
    //  Syntax : access_specifier return_type  method_name (input parameter) {}

    public void m1(){
        System.out.println("This is m1 method");
    }
    // overload the same method
    public void m1(String s){
        System.out.println("This is m1  overloaded method: "+s);
    }
    // again overload
    public void m1(int a){
        System.out.println("This is second m1  overloaded method: "+a);
    }
    // again overload

    public void m1(int a, String s){
        System.out.println("This is third m1  overloaded method: "+a + " "+s);
    }

    public static void main(String[] args) {
        MethodOverLoading obj = new MethodOverLoading();
        obj.m1();
        obj.m1("Test");
        obj.m1(33);
        obj.m1(33,"Hello");
    }
}

