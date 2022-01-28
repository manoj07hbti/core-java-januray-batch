package class_and_object;

public class Parameterized {

    String name;
    int age;
    String dept;

    //parameterized constructor
    public Parameterized(String name, int age, String dept) {
        this.name = name;
        this.age = age;
        this.dept = dept;
    }

    public static void main(String[] args) {

// SYNTAX : ClassName ObjName= new ClassName("data_member_value1","data_member_value2",.....);

        Parameterized obj1= new Parameterized("RAJ",21,"IT");

        System.out.println("Printing parameterized obj1 "+obj1.name);
        System.out.println("Printing parameterized obj1 "+obj1.age);
        System.out.println("Printing parameterized obj1 "+obj1.dept);

        Parameterized obj2= new Parameterized("Rahul",23,"CS");

        System.out.println("Printing parameterized obj2 "+obj2.name);
        System.out.println("Printing parameterized obj2 "+obj2.age);
        System.out.println("Printing parameterized obj2 "+obj2.dept);

        Parameterized obj3= new Parameterized("Mukesh",22,"CS");

        System.out.println("Printing parameterized obj3 "+obj3.name);
        System.out.println("Printing parameterized obj3 "+obj3.age);
        System.out.println("Printing parameterized obj3 "+obj3.dept);


    }
}
