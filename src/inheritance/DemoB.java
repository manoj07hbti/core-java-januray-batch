package inheritance;

public class DemoB {

    public void m1(){

        System.out.println("This is M1 Method of Class B");
    }
    public void m2(){

        System.out.println("This is M2 Method of Class B");
    }

    public static void main(String[] args) {

        DemoB obj = new DemoB();
        obj.m1();
        obj.m2();
    }
}
