public class Subway extends Vehicle {
    //instance variables
    private int cars;

    //constructor
    public  Subway (String name, int wheels, int cars) {
        super(name, wheels);
        this.cars = cars;
    }

    public int getCars() {
        return cars;
    }

    public void stopReminder() {
        System.out.println("We have arrived at the stop");
    }


}
