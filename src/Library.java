public class Library {
    String title;
    int year;
    Book[] books;

    Library(String title, int year, Book[] books) {
        this.title = title;
        this.year = year;
        this.books = books;
    }

    void displayInfo() {
        System.out.printf("%s was established in %d\n", title, year);
        System.out.println("Books available");
        for (Book book: books) {
            System.out.println(book.displayInfo());
        }
    }
}
