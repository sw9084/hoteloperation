public class Reservation {
    // backing variable
    private String roomType; // either "King or twin"
    private int numberOfNights; // how many night are they staying
    private boolean isWeekend; // true if they staying on weekend
    private double price; // price each night

    // creat constructor
    public Reservation(String roomType, int numberOfNights, boolean isWeekend) {
        this.roomType = roomType;
        this.numberOfNights = numberOfNights;
        this.isWeekend = isWeekend;

        // set the price based on the room type
        if (roomType.equalsIgnoreCase("King")) {
            price = 160.00;
        } else if (roomType.equalsIgnoreCase("Twin")) {
            price = 120.00;
        } else {
            price = 0;
        }
    }
    // getter and setter
    public String getRoomType() {
        return roomType;
    }
    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }
    public int getNumberOfNights() {
        return numberOfNights;

    }
    public void setNumberOfNights(int numberOfNights) {
        this.numberOfNights = numberOfNights;
    }
    public boolean isWeekend() {
        return isWeekend;
    }
    public void setIsWeekend(boolean isWeekend) {
        this.isWeekend = isWeekend;
    }
    public double getPrice() {
        return price;
    }
    // derived getter  that calculate total cost of the reservation
    public double getReservationTotal() {
        return price*numberOfNights;
    }
}
