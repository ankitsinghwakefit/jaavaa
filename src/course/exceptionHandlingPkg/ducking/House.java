package course.exceptionHandlingPkg.ducking;

public class House {
    public static void main(String[] args) {
        SmallHouse house = new SmallHouse();
        BigHouse bigHouse = new BigHouse();
        try {
            house.smallHouse();
            bigHouse.arryException();
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException catched in House parent");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException catched in House parent");
        } catch (Exception e) {
            System.out.println("Exception catched in House parent");
        } finally {
            System.out.println("I will run always");
        }
    }
}
