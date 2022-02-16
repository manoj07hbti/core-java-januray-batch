package polymorphism;

public class Chield extends Parent{

    //overriding : It will be done only child class , we need to change method body
    // it checks in runtime which object is created with new Keyword and same class method will be called

    public void m1(){

        System.out.println("This is M1 from Child Class");

    }

    public void m2(){

        System.out.println("This is M2 from Child Class");

    }

    public static void main(String[] args) {

        Chield obj=new Chield();

        obj.m1();

        Parent obj1= new Parent();
        obj1.m1();

        Parent parent= new Chield();

        parent.m1();
        parent.m2();

        //
        //Chield chield= new Parent();// compile time error
    }

}
