package class_and_object;

public class Book {

    //properties or DATA MEMBER

    String name="Java";
    int pages=555;
    double price=324.5;

    // capabilities  or METHOD or FUNCTION
    // read
    // write

    public static void main(String[] args) {
        //Object creation
        // SYNTAX : ClassName objName= new ClassName();
        Book book1= new Book();
        System.out.println("Printing book 1 Object : " +book1.name);
        System.out.println("Printing book 1 Object : " +book1.pages);
        System.out.println("Printing book 1 Object : " +book1.price);

        Book book2= new Book();

        System.out.println("Printing book 2 Object : " +book2.name);
        System.out.println("Printing book 2 Object : " +book2.pages);
        System.out.println("Printing book 2 Object : " +book2.price);

    }


}
