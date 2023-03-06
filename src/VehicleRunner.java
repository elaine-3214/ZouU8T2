public class VehicleRunner
{
    public static void main(String[] args)
    {

        // ---- WRITE YOUR TEST CODE BELOW! ----
        // testing all available methods on a Bicycle object
        Bicycle myBic = new Bicycle ("weels", 2, 21);
        System.out.println(myBic.getName()); // inherited method
        System.out.println(myBic.getWheels()); // inherited method
        System.out.println(myBic.getGearCount()); // method ONLY available on Bicycle objects
        myBic.move(50); // inherited method
        myBic.turn(180); // inherited method
        myBic.brake(0.2); // inherited method
        myBic.ringBell(); // method ONLY available on Bicycle objects


        //testing for subway
        Subway mySub = new Subway ("A", 60, 10);
        System.out.println(mySub.getName()); // inherited method
        System.out.println(mySub.getWheels()); // inherited method
        System.out.println(mySub.getCars()); // method ONLY available on Subway objects
        mySub.move(30); // inherited method
        mySub.turn(90); // inherited method
        mySub.brake(0.3); // inherited method
        mySub.stopReminder(); // method ONLY available on Subway objects

    }
}