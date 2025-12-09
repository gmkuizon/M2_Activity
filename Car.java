package M2_Activity3;

public class Car {
	// Attributes
	private String brand;
	private String model;
	private int year;

	// Constructor
    public Car() {    	
    }

    public Car(String brand, String model, int year) {
    	this.brand = brand;
    	this.model = model;
    	this.year = year;
    }
    
	// Setters Getters
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	public String getBrand() {
		return brand;
	}
	
	public void setModel(String model) {
		this.model = model;
	}
	
	public String getModel() {
		return model;
	}
	
	public void setYear(int year) {
		this.year = year;
	}
	
	public int getYear() {
		return year;
	}
	
	// Method to display car details
	public void displayInfo() {
		System.out.println("Car: " + brand + " " + model + " (" + year + ")");
		System.out.println("");
	}

	
}
