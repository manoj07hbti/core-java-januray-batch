package conditional_statements;

public class ConditionalPart2 {

    public static void main(String[] args) {

        int age=19;
        String cityName="Delhi";

// AND OPERATOR

        if( age>18 && cityName=="AGRA"){

            System.out.println("YOu are eligible for voting in AGRA");
        }
        else
        {
            System.out.println("You are NOT eligible for voting in AGRA");

        }

        //OR OPERATOR

        if( age>18 || cityName=="AGRA"){

            System.out.println("OR OPERATOR : YOu are eligible for voting in AGRA");
        }
        else
        {
            System.out.println("OR OPERATOR: You are NOT eligible for voting in AGRA");

        }

       int marks=59;
       String section="IT";

       if (marks>60 && section=="IT"){
           System.out.println("First division with IT ");
       }
       else {
           System.out.println("NOT First division with IT ");
       }

       //OR OPERATOR
        if (marks>60 || section=="IT"){
            System.out.println("OR OPERATOR : First division with IT ");
        }
        else {
            System.out.println("OR OPERATOR : NOT First division with IT ");
        }


    }
}
