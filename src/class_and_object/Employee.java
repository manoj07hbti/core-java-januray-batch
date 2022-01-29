package class_and_object;

public class Employee {

    String name;
    double salary;
    String dept;

    /* todo    Member function or method -- capabilities
            // Syntax : access_specifier return_type  method_name (parameter) {}
             //access_specifier -> public , private , protected, default   THEORY PART
            //return_type   -> output of function or method :  void : no return type
            //method_name -> can be anything: it should be meaningful
            // parameter ->  input parameter : optional
      */

    // Syntax : access_specifier return_type  method_name (parameter) {}
    // work
    public void work(){

        System.out.println("I am in work method");
    }

    //getSalary
    public void getSalary(){

        System.out.println("This is getSalary Method ");
    }

    public static void main(String[] args) {

        Employee obj= new Employee();
        obj.work();
        obj.getSalary();

    }
}
