package class_and_object;



public class MethodReturnType {

    public String message( String name){

        String output = name+" You are learning Core Java ";

     return output;
    }

    public int makeSquare(int n){

        int result=n*n;

        return result;
    }

    public double calculateSalary(int days,double per_day_charge){

        double salary= days*per_day_charge;
      return salary;
    }
    public static void main(String[] args) {

        MethodReturnType obj= new MethodReturnType();
       String result= obj.message("Rahul");

       System.out.println("Output is "+result);

       int output =obj.makeSquare(3);
       System.out.println("Square of number is "+output);



       System.out.println(obj.calculateSalary(30,1980.5));

    }
}
