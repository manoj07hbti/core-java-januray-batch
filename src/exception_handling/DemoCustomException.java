package exception_handling;

import java.util.Scanner;

public class DemoCustomException {

    public void vote() throws AgeException {
        Scanner obj= new Scanner(System.in);

        System.out.println("Welcome to Voting System , Please enter your Age");

        int age=obj.nextInt();

        if (age<18){

            throw new AgeException("Age is not eligible for Voting ");
        }
        else {
            System.out.println("Welcome to voting App");
        }
    }

    public static void main(String[] args) {

        DemoCustomException obj= new DemoCustomException();
        try {
            obj.vote();
        } catch (AgeException e) {
            e.printStackTrace();
        }

    }
}
