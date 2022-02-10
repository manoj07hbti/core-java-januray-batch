package collection_demo;

import model.Employee;
import model.Student;

import java.util.HashMap;

public class HashMapWithModel {

    public static void main(String[] args) {

        HashMap <Integer, Employee> employeeHashMap= new HashMap<>();

        Employee employee= new Employee("Raj",44,"IT");
        Employee employee1= new Employee("Rahul",12,"CS");
        Employee employee2= new Employee("Ramesh",11,"IT");
        Employee employee3= new Employee("Kamal",44,"CS");
        Employee employee4= new Employee("Rakesh",45,"IT");


        employeeHashMap.put(1,employee);
        employeeHashMap.put(2,employee1);
        employeeHashMap.put(3,employee2);
        employeeHashMap.put(4,employee3);
        employeeHashMap.put(5,employee4);

        for (Integer key: employeeHashMap.keySet()){

          System.out.println(employeeHashMap.get(key).getName());

        }

    }
}
