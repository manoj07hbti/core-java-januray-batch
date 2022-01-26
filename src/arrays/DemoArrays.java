package arrays;

public class DemoArrays {

    public static void main(String[] args) {

        // SYNTANX: datatype [] var_name  = {,,,};

       /* String cityname1="AGRA";
        String cityname2="PUNE";
        String cityname3="DELHI";*/

        String [] cities ={"AGRA","PUNE","DELHI","JAIPUR","NOIDA"};

        System.out.println(cities[0]);
        System.out.println(cities[1]);
        System.out.println(cities[2]);

        for (int i=0; i<cities.length; i++){

            System.out.println("inside for loop " +cities[i]);
        }

        // Advanced for loop
        //
        //for (DataType var_name : Array/collection){
        //
        //}

        for (String var: cities){
            System.out.println("Printing inside advanced for loop--" +var);
        }


        // SYNTANX: datatype [] var_name  = {,,,};

        int [] marks= {43,45,33,47,76,34,56,65,67};

        for (int var: marks){

            System.out.println("Printing marks array "+var);
        }

        double [] prices= {23.4,55.6,77.8,22.4,45.3};

        for (double var: prices ){

            System.out.println("Printing prices "+var);
        }

    }
}
