package collection_demo;

import arrays.DemoArrays;

import java.util.ArrayList;

public class DemoList {


    public ArrayList createList(){

        ArrayList list= new ArrayList();
        list.add("Java");
        list.add("Spring ");
        list.add("Spring Boot");
        list.add("CLoud");

        return list;
    }

    public static void main(String[] args) {

        String cityName="Agra";
        String cityName1="Delhi";
        String cityName2="Jaipur";
        String cityName3="Pune";

        //SYNTAX: 	ArrayList list=new ArrayList();//

        ArrayList list= new ArrayList();
        // adding element to ArrayList
        list.add("AGRA");// 0 index
        list.add("Pune");// 1 index
        list.add("Delhi");// 2 index
        list.add("Jaipur");// 3 index
        list.add("Mumbai");// 4 index

        // get elements
         System.out.println("Printing city " +list.get(1));
        System.out.println("Printing city " +list.get(4));
        System.out.println("Printing city " +list.get(2));

        // for (Datatype var: arraylist/collection) {CODE}
        for (Object var: list){
            System.out.println("Printing list in loop "+var);
        }

      // removing elements

        list.remove(1);

        System.out.println("Printing city at index 1 after remove " +list.get(1));

        list.remove(2);
        System.out.println("Printing city at index 2 after remove " +list.get(2));


        DemoList obj = new DemoList();
        ArrayList result =obj.createList();

        for (Object var: result){

            System.out.println("Printing result list using method "+var);

        }
    }
}
