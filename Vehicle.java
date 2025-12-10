package M2_Activity6;

public abstract class Vehicle {
	
	private int numberOfWheels;
	private String brand;
	
	public Vehicle () {		
	}
	
	public Vehicle(int numberOfWheels, String brand) {
		this.numberOfWheels = numberOfWheels ;
		this.brand = brand;
	}
	
	public void setNumberOfWheels (int numberOfWheels) {
		this.numberOfWheels = numberOfWheels;
	}
	
	public int getNumberOfWheels() {
		return numberOfWheels;
	}
	
	public void setBrand (String brand) {
		this.brand = brand;
	}
	
	public String getBrand() {
		return brand;
	}
	
	public abstract void startEngine();
	
    public void destroy() {
        System.out.println(brand + " with " + numberOfWheels + " wheels has been destroyed!");
    }

}
