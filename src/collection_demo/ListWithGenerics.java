package collection_demo;

import java.util.ArrayList;

public class ListWithGenerics {

    public ArrayList<String> createList(){

     //SYNTAX: Collection <Datatype> obj_name=new Collection();

        ArrayList <String> names= new ArrayList<>();
        names.add("Java");
        names.add("Spring");
        names.add("Spring boot");
        names.add("Cloud");

        return names;
    }

    public ArrayList <Integer> createIntegerList(){

        ArrayList <Integer> integerArrayList= new ArrayList<>();
        integerArrayList.add(1);
        integerArrayList.add(33);
        integerArrayList.add(45);


        return integerArrayList;
    }
    // create double datatype list

    public static void main(String[] args) {

        ListWithGenerics obj= new ListWithGenerics();
        ArrayList<String> arrayList= obj.createList();

        for (String var: arrayList){

            System.out.println("Printing list "+var);

        }

        ArrayList <Integer> integerArrayList= obj.createIntegerList();

        for (Integer var: integerArrayList){

            System.out.println("Printing Integer ArrayList "+var);
        }
    }


}
