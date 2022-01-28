package class_and_object;

public class Doctor {

    String name;
    String dept;
    double salary;

    // parameterized constructor

    public Doctor(String name, String dept, double salary) {
        this.name = name;
        this.dept = dept;
        this.salary = salary;
    }

    public static void main(String[] args) {

        Doctor obj1= new Doctor("Kamal","Surgeon",3424444.5);

        System.out.println(obj1.name +" "+ obj1.dept+" " + obj1.salary);

        Doctor obj2= new Doctor("Sanjeev","Surgeon",3524444.5);

        System.out.println(obj2.name +" "+ obj2.dept+" " + obj2.salary);

    }
}
