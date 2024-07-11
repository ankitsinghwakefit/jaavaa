package course.encapsulation;

public class MyHouse {
    public static void main(String[] args) {
        House myHouse = new House();
        myHouse.setHouseName("My House");
        myHouse.setDoorsCount(2);
        myHouse.setHouseArea(1000);
        System.out.println(myHouse.getHouseArea());
        myHouse.houseColor();
        myHouse.houseInfo();
    }
}
