package collection_demo;

import java.util.HashMap;

public class HashMapDemo {

    public static void main(String[] args) {

        //Syntax: HashMap <DataType_key, DataType_Value> objName= new HashMap();

        HashMap <Integer, String> hashMap= new HashMap<>();

        // adding an element
        hashMap.put(1,"Java");
        hashMap.put(2,"Spring");
        hashMap.put(3,"Spring Boot");
        hashMap.put(4,"Cloud");

        // get an element get(Key)
        System.out.println( hashMap.get(3));
        System.out.println( hashMap.get(2));
        System.out.println( hashMap.get(1));
// hashmap.Keyset()---> returns set of Key in a map
        for (Integer var: hashMap.keySet()){

            System.out.println("Printing HashMap "+hashMap.get(var));
        }


    }
}
