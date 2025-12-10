package M2_Activity6;

public class Car extends Vehicle implements Refuelable {
	
    public Car(String brand, int numberOfWheels) {
        super(numberOfWheels, brand);
    }

    @Override
    public void startEngine() {
        System.out.println(getBrand() + " car with " + getNumberOfWheels() + " wheels has been started...");
    }

    @Override
    public void refuel() {
        System.out.println("Refueling the " + getBrand() + " car...");
    }
    
}
