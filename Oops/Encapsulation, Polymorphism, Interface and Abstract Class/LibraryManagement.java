public class LibraryManagement {
    public static void main(String[] args) {
        LibraryItem[] items = {
            new BookItem("B101", "Java Programming", "Author A"),
            new Magazine("M201", "Tech Today", "Author B"),
            new DVD("D301", "Movie X", "Director C")
        };
        for (LibraryItem it : items) {
            it.getItemDetails();
            System.out.println("Loan Duration (days): " + it.getLoanDuration());
            if (it instanceof Reservable) System.out.println("Available: " + ((Reservable) it).checkAvailability());
            System.out.println("---");
        }
    }
}

abstract class LibraryItem {
    private String itemId;
    private String title;
    private String author;

    public LibraryItem(String itemId, String title, String author) { this.itemId = itemId; this.title = title; this.author = author; }

    public String getItemId() { return itemId; }
    public String getTitle() { return title; }
    public String getAuthor() { return author; }

    public void getItemDetails() { System.out.println("ID:" + itemId + ", Title:" + title + ", Author:" + author); }
    public abstract int getLoanDuration();
}

interface Reservable {
    boolean reserveItem(String user);
    boolean checkAvailability();
}

class BookItem extends LibraryItem implements Reservable {
    private boolean available = true;
    public BookItem(String id, String t, String a) { super(id, t, a); }
    public int getLoanDuration() { return 21; }
    public boolean reserveItem(String user) { if (available) { available = false; return true; } return false; }
    public boolean checkAvailability() { return available; }
}

class Magazine extends LibraryItem {
    public Magazine(String id, String t, String a) { super(id, t, a); }
    public int getLoanDuration() { return 7; }
}

class DVD extends LibraryItem {
    public DVD(String id, String t, String a) { super(id, t, a); }
    public int getLoanDuration() { return 3; }
}
