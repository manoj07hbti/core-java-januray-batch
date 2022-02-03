package class_and_object;

import java.util.Scanner;

public class CalculatorWithInput {

    public void add(int a, int b){

        int result=a+b;
        System.out.println("ADDITION IS : "+result);
    }

    //subtraction
    //multi
    //divide
    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);
        int choice =0;
        System.out.println("Please enter 1 for Add, 2 for Subtraction , 3 Divide 4 multi :");
        choice=scanner.nextInt();


        CalculatorWithInput obj= new CalculatorWithInput();
        if (choice==1){

            obj.add(13,6);
        }else if(choice==2){
            //subtraction
        }
        else if (choice==3){
            // Divide
        }
        else {
            //multi
        }

    }
}
