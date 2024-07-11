package course.polymorphismPkg;

public abstract class Animal {
    private String walkSpeed;

    // if we mark method as final or static in super class it will not be override
    // in sub
    // class
    public void setWalkSpeed(String speed) {
        this.walkSpeed = speed;
    }

    public String getWalkSpeed() {
        return this.walkSpeed;
    }

    protected void eat() {
        System.out.println("Animal eats meat");
    };

    public abstract void walk();
}
