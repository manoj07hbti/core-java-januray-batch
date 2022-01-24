package loops;

public class TableOfTwo {

    public static void main(String[] args) {

        int number=2;

        for (int i=1; i<=10; i++){


            if(i==2){
                System.out.println("2 Two are ");
            }
            if (i==3){
                System.out.println("2 Three are ");
            }
            if(i==4){
                System.out.println("2 Fours are ");
            }
            System.out.println(number*i );
        }

    }
}
