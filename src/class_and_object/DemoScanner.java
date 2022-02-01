package class_and_object;

import org.omg.Messaging.SYNC_WITH_TRANSPORT;

import java.util.Scanner;

public class DemoScanner {

    public static void main(String[] args) {

        // step 1 create scanner class Object

        Scanner obj= new Scanner(System.in);

        System.out.println("Please enter your name : ");

        String name= obj.nextLine();// reads String Input

        System.out.println("You have entered name as "+name);

        System.out.println("Please Enter your Age :");
        int age= obj.nextInt();
        System.out.println("You have entered age as "+age);

        System.out.println("Please enter Price :");
        double price=obj.nextDouble();
        System.out.println("You have entered price as "+price);
    }
}
