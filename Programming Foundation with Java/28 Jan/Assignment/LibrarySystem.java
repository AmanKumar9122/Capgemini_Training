import java.util.*;

class Library {
    private static int totalBooks = 0;
    private int id;
    private String title;
    private String author;

    public Library(int id, String title, String author) {
        this.id = id;
        this.title = title;
        this.author = author;
        totalBooks++;
    }

    public static int getTotalBooks() {
        return totalBooks;
    }

    public void display() {
        System.out.println(id + " " + title + " " + author);
    }
}

public class LibrarySystem {
    public static void main(String[] args) {
        Library b1 = new Library(1, "Java Programming", "James");
        Library b2 = new Library(2, "Data Structures", "Mark");
        Library b3 = new Library(3, "Operating Systems", "Andrew");

        b1.display();
        b2.display();
        b3.display();

        System.out.println(Library.getTotalBooks());
    }
}