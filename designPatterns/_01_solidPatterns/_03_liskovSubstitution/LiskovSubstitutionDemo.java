package _03_liskovSubstitution;

// sub type objects can replace super type objects without effecting the functionality inherent in the super type.
// here vehicle gets replace by Bus and Car
abstract class Vehicle{
    abstract int getSpeed();
    abstract int getCubicCapacity();
}

class Car extends Vehicle{
    int getSpeed(){ return 10; }
    int getCubicCapacity() { return 10; }
    boolean hatchBack(){ return true; }
}

class Bus extends Vehicle{
    int getSpeed(){ return 100; }
    int getCubicCapacity() { return 100; }
    String getEmergencyExitLock(){ return "yes"; }
}

public class LiskovSubstitutionDemo {
    public static void main(String[] args) {
        Vehicle vehicle = new Bus();
        System.out.println(vehicle.getSpeed());
        vehicle = new Car();
        System.out.println(vehicle.getSpeed());
    }
}
