package class_and_object;

import java.util.Scanner;

public class Calculator {

    //Data member
    int a;
    int b;

    //methods
    //add

    public void addition(){

       System.out.println("ADITION : Please enter value of a: ");
        Scanner obj= new Scanner(System.in);
        int a=obj.nextInt();
        System.out.println("Please enter value of b: ");
        int b=obj.nextInt();
        int result=a+b;
        System.out.println("This is Addition Method .."+result);
    }

    //subtraction

    public void subtraction (){
        System.out.println("SUBTRACTION : Please enter value of a: ");
        Scanner obj= new Scanner(System.in);
        int a=obj.nextInt();
        System.out.println("Please enter value of b: ");
        int b=obj.nextInt();

        int result=a-b;
        System.out.println("This is Subtraction Method .."+result);
    }
// divide  a/b;
// multi    a*b;

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        Calculator obj= new Calculator();
        int flag=0;
        do {
            obj.addition();
            obj.subtraction();
            System.out.println("********Please press 1 to continue or any number to quit:**************");
            flag=scanner.nextInt();
        }
        while (flag==1);
    }


}
