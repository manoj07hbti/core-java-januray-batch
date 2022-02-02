package class_and_object;

public class MethodWithInput {

    //// Syntax : access_specifier return_type  method_name (Datatype var1,Datatype var2......)

    public void message(String name){

        System.out.println("Hello , Welcome to Java: "+name);
    }

    public void checkAge(int age){

        if (age<18) {
            System.out.println("Your age is less than 18 so not eligible for voting ");
        }
        else{
            System.out.println("Eligible for voting ");
        }
    }

    public void m1( String name , int age){

        System.out.println("You have entered age as : "+age +" "+"Name is : "+name);
    }

    public void makeSquare(int n){

        System.out.println("Square of given number is : "+ n*n);
    }
    public static void main(String[] args) {

        MethodWithInput obj= new MethodWithInput();
        obj.message("Rohit");
        obj.checkAge(12);
        obj.m1("Rahul",23);

        obj.makeSquare(9);
    }

}
