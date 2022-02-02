package class_and_object;

public class CalculatorWithInput {

    public void add(int a, int b){

        int result=a+b;
        System.out.println("ADDITION IS : "+result);
    }

    //subtraction
    //multi
    //divide
    public static void main(String[] args) {

        CalculatorWithInput obj= new CalculatorWithInput();

        obj.add(13,6);
    }
}
