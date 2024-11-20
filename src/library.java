public class library {
    public static void main(String[] args) {
        Book book1 = new Book("Sword of Truth: Wizard's First Rule", "Terry Goodkind", 836);
        Book book2 = new Book("Siddhartha", "Hermann Hesse", 152);

        book1.displayDetails();
        book2.displayDetails();
    }
}

class Book {
    private String title;
    private String author;
    private int numberOfPages;

    public Book(String title, String author, int numberOfPages) {
        this.title = title;
        this.author = author;
        this.numberOfPages = numberOfPages;
    }

    public void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Number of Pages: " + numberOfPages);
    }
}
