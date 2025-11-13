public class HotelBooking {
    String guestName;
    String roomType;
    int nights;

    HotelBooking() {
        guestName = "Unknown";
        roomType = "Standard";
        nights = 1;
    }

    HotelBooking(String guestName, String roomType, int nights) {
        this.guestName = guestName;
        this.roomType = roomType;
        this.nights = nights;
    }

    HotelBooking(HotelBooking other) {
        this.guestName = other.guestName;
        this.roomType = other.roomType;
        this.nights = other.nights;
    }

    public static void main(String[] args) {
        HotelBooking h1 = new HotelBooking();
        HotelBooking h2 = new HotelBooking("Rahul", "Deluxe", 3);
        HotelBooking h3 = new HotelBooking(h2);
        System.out.println("Default Booking: " + h1.guestName + ", " + h1.roomType + ", " + h1.nights);
        System.out.println("Custom Booking: " + h2.guestName + ", " + h2.roomType + ", " + h2.nights);
        System.out.println("Copied Booking: " + h3.guestName + ", " + h3.roomType + ", " + h3.nights);
    }
}