package class_and_object;

public class Calculator {

    //Data member
    int a;
    int b;

    //methods
    //add

    public void addition(){

        int a=13;
        int b=33;
        int result=a+b;
        System.out.println("This is Addition Method .."+result);
    }

    //subtraction

    public void subtraction (){
        int a=55;
        int b=33;

        int result=a-b;
        System.out.println("This is Subtraction Method .."+result);
    }
// divide  a/b;
// multi    a*b;

    public static void main(String[] args) {

        Calculator obj= new Calculator();
        obj.addition();
        obj.subtraction();
    }


}
