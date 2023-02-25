package dataStructure;
import java.util.ArrayList;

class Book {
    String name;
    String author;

    public Book() {
    }

    public Book(String name, String author) {
        this.name = name;
        this.author = author;
    }

    @Override
    public String toString() {
        return name + ", " + author;
    }
}


public class Test5 {
    public static void main(String[] args) {

        ArrayList<Book> library = new ArrayList<Book>();

        library.add(new Book("book1", "Lee"));
        library.add(new Book("book2", "Kim"));
        library.add(new Book("book3", "Choi"));
        library.add(new Book("book4", "Park"));
        library.add(new Book("book5", "Jang"));

        for (int i = 0; i < library.size(); i++) {
            System.out.println(library.get(i));
        }

        System.out.println();

        for (Book book : library) {
            System.out.println(book);
        }
    }

}
