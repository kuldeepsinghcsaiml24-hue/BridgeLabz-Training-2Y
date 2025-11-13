class Book {
    private static String libraryName = "Central Library";
    private final String isbn;
    private String title;
    private String author;

    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    public static void displayLibraryName() {
        System.out.println("Library Name: " + libraryName);
    }

    public void displayBookDetails() {
        if (this instanceof Book) {
            System.out.println("Title: " + title);
            System.out.println("Author: " + author);
            System.out.println("ISBN: " + isbn);
        }
    }

    public static void main(String[] args) {
        Book b1 = new Book("1984", "George Orwell", "ISBN1234");
        Book b2 = new Book("Java Basics", "James Gosling", "ISBN5678");
        Book.displayLibraryName();
        b1.displayBookDetails();
        b2.displayBookDetails();
    }
}