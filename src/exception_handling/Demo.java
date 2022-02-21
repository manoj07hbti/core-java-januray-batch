package exception_handling;

public class Demo {


    public void divide(int a , int b){

        int result=0;

        try {
             result=a/b;
        }
        catch (Exception e){
            System.out.println("Exception Occurred "+e.toString());
        }


        System.out.println("Division of a and b is : "+result);

    }

    public static void main(String[] args) {
        Demo obj = new Demo();

        obj.divide(10,0);
    }
}
