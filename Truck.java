package M2_Activity6;

public class Truck extends Vehicle implements Refuelable {
	
    public Truck(String brand, int numberOfWheels) {
        super(numberOfWheels, brand);
    }

    @Override
    public void startEngine() {
    	System.out.println(getBrand() + " truck with " + getNumberOfWheels() + " wheels has been started...");
    }

    @Override
    public void refuel() {
        System.out.println("Refueling the " + getBrand() + " truck...");
    }
    
}