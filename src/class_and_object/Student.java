package class_and_object;

public class Student {

    // data member
    String name="Raj";
    int age=23;
    String section="CS";


   //capabilities or method or function
    // study

    public void study(){

        System.out.println("This is study method");
    }

    // play

    // run

    public static void main(String[] args) {

        // SYNTAX : ClassName objName= new ClassName();

        Student obj1= new Student();
        obj1.study();// calling method

        System.out.println("Printing Student obj1 1 Object : " +obj1.name);
        System.out.println("Printing Student obj1 1 Object : " +obj1.section);
        System.out.println("Printing Student obj1 1 Object : " +obj1.age);

    }

}
