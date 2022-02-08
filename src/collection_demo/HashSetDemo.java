package collection_demo;

import java.util.HashSet;

public class HashSetDemo {

    public void createSet(){

        //SYNTAX: Collection <Datatype> obj_name=new Collection();

        HashSet <String> names= new HashSet<>();

        names.add("Java");
        names.add("Spring");
        names.add("Spring Boot");
        names.add("Java");
        names.add("Spring");
        names.add("Spring Boot");

        for (String var: names){

            System.out.println("Printing Set : "+var);
        }
    }

    public void createIntSet(){

        HashSet <Integer> integerHashSet= new HashSet<>();
        integerHashSet.add(23);
        integerHashSet.add(33);
        integerHashSet.add(23);
        integerHashSet.add(33);
        integerHashSet.add(23);
        integerHashSet.add(33);

        for (Integer var: integerHashSet){

            System.out.println("Printing Integer Set "+var);
        }
    }

    public static void main(String[] args) {
        HashSetDemo obj = new HashSetDemo();
        obj.createSet();
        obj.createIntSet();

    }
}
