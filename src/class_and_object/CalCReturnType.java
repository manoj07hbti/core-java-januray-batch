package class_and_object;

public class CalCReturnType {

    public int add(int a, int b){

        int result=a+b;
        return result;
    }

    public static void main(String[] args) {

        CalCReturnType obj= new CalCReturnType();
       int output= obj.add(3,9);
       System.out.println("Addition is "+output);
    }
}
