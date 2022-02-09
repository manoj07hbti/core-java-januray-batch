package collection_demo;

import model.Student;

import java.util.HashSet;

public class HashSetStudent {

    public static void main(String[] args) {

        HashSet<Student> studentHashSet= new HashSet<>();

        Student student= new Student("Rahul",21,"IT");
        Student student1= new Student("Raj",24,"IT");
        Student student2= new Student("Mahesh",22,"IT");
        Student student3= new Student("Rahul",25,"IT");
        Student student4= new Student("Raj",26,"IT");

        studentHashSet.add(student);
        studentHashSet.add(student1);
        studentHashSet.add(student2);
        studentHashSet.add(student3);
        studentHashSet.add(student4);

        for(Student var: studentHashSet){

            System.out.println("Printing student hashset "+var.getName());
        }






    }
}
