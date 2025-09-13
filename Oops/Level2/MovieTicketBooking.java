class MovieTicket {
    String mName;
    int seat;
    double price;

    MovieTicket(String mName, int seat, double price) {
        this.mName = mName;
        this.seat = seat;
        this.price = price;
    }

    void book(int s, double p) {
        seat = s;
        price = p;
    }

    void show() {
        System.out.println("Movie: " + mName);
        System.out.println("Seat: " + seat);
        System.out.println("Price: " + price);
    }
}

public class MovieTicketBooking {
    public static void main(String[] args) {
        MovieTicket t = new MovieTicket("Avatar 2", 0, 0);
        t.book(12, 250.0);
        t.show();
    }
}
