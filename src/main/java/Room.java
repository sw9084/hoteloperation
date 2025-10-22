public class Room {
    // creat the backing variable (the data room)
    private int numberOfBeds; // how many beds in the room
    private double price; // the cost of the night
    private boolean isOccupied; // true if the room is not available
    private boolean isDirty; // true if the room needs clean

    // creat constructor // this sets the initial values for each variable .
    public Room(int numberOfBeds, double price, boolean isOccupied, boolean isDirty) {
        this.numberOfBeds = numberOfBeds;
        this.price = price;
        this.isOccupied = isOccupied;
        this.isDirty = isDirty;
    }

    // getter methods that allows other classes to ask for the info
    public int getNumberOfBeds() {
        return numberOfBeds;
    }

    public double getPrice() {
        return price;
    }

    public boolean isOccupied() {
        return isOccupied;
    }

    public boolean isDirty() {
        return isDirty;
    }

    // Derived getter - calculated it based of the two variable
    public boolean isAvailable() {
        return !isOccupied && !isDirty; // the room is available if not occupied and not dirty
    }

    // add new methode
    public boolean checkIn() {
        if (this.isAvailable()) {
            this.isOccupied = true;
            this.isDirty = true;
            return true;
        }

        // otherwise
        else {
            return false;

        }

    }

    public boolean checkout() {
        if (this.isOccupied) {
            this.isDirty = true;
            this.isOccupied = false;
            return true;
        } else {
            return false;
        }
    }

    public boolean cleanRoom() {
        if (this.isDirty) {
            this.isDirty = false;
            return true;
        } else {
            return false;
        }
    }
}






