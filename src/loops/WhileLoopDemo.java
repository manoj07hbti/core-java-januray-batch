package loops;

public class WhileLoopDemo {

    public static void main(String[] args) {
       /* SYNTAX while(condition){
                            //code to be executed
                                }
        */
       int i=0;
       while (i<5){
           System.out.println("Hello World "+i);
           i++;
       }

      /* do {

            }
       while (condition);*/
     int j=0;
      do{
          System.out.println("DO while loop "+j);
          j++;
      }while (j<5);


    }
}
