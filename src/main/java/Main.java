public class Main {
    public static void main(String[] args) {

        // test room class
        Room room1 = new Room(2, 160, false, false);
        System.out.println("Room available? " + room1.isAvailable());

        // test reservation class
        Reservation reservation1 = new Reservation("King", 3, true);
        System.out.println("Room type: " + reservation1.getRoomType());
        System.out.println("Price per night: $" + reservation1.getPrice());
        System.out.println("Total reservation cost: $" + reservation1.getReservationTotal());

        // test employee class
        Employee emp1 = new Employee(111, " Bethlehem Gebremedhen", " Front Desk", 20.00, 45);
        System.out.println("\nEmployee: " + emp1.getName());
        System.out.println("Regular hours: " + emp1.getRegularHoursWorked());
        System.out.println("Total pay: $" + emp1.getTotalPay());
     }

}

