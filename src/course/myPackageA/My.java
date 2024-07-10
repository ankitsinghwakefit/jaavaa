package course.myPackageA;

import course.staticPkg.InstanceDefination;

public class My {

    static {
        System.out.println("static blocl 1");
    }

    public My() {
        System.out.println("constructor");
    }

    public static void main(String[] args) {
        System.out.println();
        int x = 10;
        int y = x + 2;
        int z = x + y + 2;
        System.out.println("value of Z is " + z);
        My me = new My();
        InstanceDefination.bookTicket(1234, 21, 123, "business");
        System.out.println(InstanceDefination.availableSeat);
        eat(1234, 21, 123, "business");
    }

    public static void eat(int flightNumber, int seatNUmber, int ticketId, String ticketCategory) {
        System.out.println("he can eat");
        InstanceDefination.bookTicket(1234, 21, 123, "business");
    }

    static {
        System.out.println("static block 2");
    }

    public static void weight() {
        System.out.println("his weight is");
    }
}
