public class Bicycle extends Vehicle {
    //instance variables (attributes)
    private int gearCount;

    //constructor
    public Bicycle(String name, int wheels, int gearCount) {
        super(name, wheels);
        this.gearCount = gearCount;
    }

    //getter
    public int getGearCount() {
        return gearCount;
    }

    //ring bell
    public void ringBell() {
        System.out.println("Ring ring ring");
    }

}
