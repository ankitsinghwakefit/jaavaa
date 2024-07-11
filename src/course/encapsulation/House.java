package course.encapsulation;

public class House {
    // encapsulation notes
    // encapsulation means avoiding the exposure of code until it's not nessary
    // encapsulation is used for data hiding, data validation, and data modification
    // (setters and getters)
    // encapsulation is used for data integrity (data validation)
    // encapsulation is used for code organization (grouping related data and
    // methods together)
    // encapsulation is used for code reusability (every class has its own setters
    // and getters)
    // encapsulation is used for code security (only getters and setters are
    // exposed)
    // // encapsulation is used for code readability (every variable and method has
    // a meaningful name)
    // // encapsulation is used for code maintainability (every change in code will
    // // encapsulation is used for code flexibility (every change in code will be
    // be done in one place)
    // encapsulation is used for code extensibility (every new requirement will be
    // added in one place)
    // encapsulation is used for code performance (every variable and method has a
    // meaningful name)
    // encapsulation is used for code portability (every class has its own setters
    // and getters)
    // done in one place)
    // encapsulation is used for code adaptability (every change in code will be
    // done in one place)

    private String houseName;
    private int doorsCount;
    private int houseArea;

    public void setHouseName(String houseName) {
        this.houseName = houseName;
    }

    // we can make doorcount read only by not defining setDoorCount
    public void setDoorsCount(int doorsCount) {
        this.doorsCount = doorsCount;
    }

    public void setHouseArea(int houseArea) {
        this.houseArea = houseArea;
    }

    public String getHouseNmae() {
        return houseName;
    }

    public int getDoorsCount() {
        return doorsCount;
    }

    public int getHouseArea() {
        return houseArea;
    }

    public void houseColor() {
        System.out.println("house will have some color");
    }

    public void houseInfo() {
        System.out.println("house info : " + houseName + " and " + doorsCount + " and area is " + houseArea);
    }
}
