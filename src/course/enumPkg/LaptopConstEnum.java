package course.enumPkg;

public enum LaptopConstEnum {
    // its a
    Mac(2000), Hp(1500), Dell();

    private int price;

    private LaptopConstEnum(int price) {
        this.price = price;
    }

    private LaptopConstEnum() {
        this.price = 500;
    }

    public int getPrice() {
        return this.price;
    }
}
