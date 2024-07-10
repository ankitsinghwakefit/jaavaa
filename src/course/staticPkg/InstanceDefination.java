package course.staticPkg;

// see my.java in pckA
public class InstanceDefination {
    public int flightNumber; // instance var it is for instance
    public int seatNUmber;
    public int ticketId;
    public String ticketCategory;

    public static int availableSeat = 2;
    // this static variable is common to all instances

    public static void main(String[] args) {
        bookTicket(1234, 21, 123, "business");
        bookTicket(1234, 22, 124, "business");
        bookTicket(1234, 42, 154, "business");
        System.out.println(availableSeat);
    }

    public static void bookTicket(int flightNumber, int seatNUmber, int ticketId, String ticketCategory) {
        // static int book = 20; // local variable can't be a static var
        if (availableSeat > 0) {
            InstanceDefination ticket1 = new InstanceDefination(flightNumber, seatNUmber, ticketId, ticketCategory);
        } else {
            System.out.println("no seats available");
        }
    }

    public InstanceDefination(int flightNumber, int seatNUmber, int ticketId, String ticketCategory) {
        System.out.println("constructor" + availableSeat); // static var can be accessed anywhere in class
        this.flightNumber = flightNumber;
        this.seatNUmber = seatNUmber;
        this.ticketCategory = ticketCategory;
        this.ticketId = ticketId;
        availableSeat--;
    }

    static {
        System.out.println("static block of this class");
    }
}

// rules of static in java
// 1. static members can only access static members
// 2. static variable can be accessed without creating a new instance by using
// class name only
// 3. static methods can be accessed without creating a new instance by using
// class name like Math.random()
// 4.

// 5. static block code executes only once during class loading and event before
// class main method.

// there is also class child class that is defined inside a class and it can
// access all variables and methods of
// outerClass
