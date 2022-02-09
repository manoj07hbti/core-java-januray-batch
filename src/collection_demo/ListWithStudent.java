package collection_demo;

import model.Student;

import java.util.ArrayList;

public class ListWithStudent {

    public ArrayList <Student>  createStudentList(){

        //SYNTAX: Collection <Datatype> obj_name=new Collection();

        ArrayList <Student> studentArrayList= new ArrayList<>();


        Student student1= new Student("Raj",23,"IT");
        Student student2= new Student("Rahul",23,"CS");
        Student student3= new Student("Mukesh",21,"IT");
        // adding to arraylist
        studentArrayList.add(student1);
        studentArrayList.add(student2);
        studentArrayList.add(student3);

        return studentArrayList;

    }

    public static void main(String[] args) {
        ListWithStudent obj= new ListWithStudent();

        ArrayList <Student> studentArrayList=  obj.createStudentList();

        // SYNTAX : for (Datatype var : collection/array){CODE}
        for (Student var: studentArrayList){


            System.out.println("Printing name "+var.getName());
            //System.out.println("Printing Age "+var.getAge());
            System.out.println("Printing Section "+var.getSection());

        }
    }
}
