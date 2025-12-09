package M2_Activity3;

public class M2Activity3 {

	public static void main(String[] args) {	
		// Using parameter
		Car myCar1 = new Car("Toyota", "Avalon", 1994);
        myCar1.displayInfo();
        
        // Using setter and getter
        Car myCar2 = new Car();
        myCar2.setBrand("Toyota");
        myCar2.setModel("Camry");
        myCar2.setYear(1982);
        myCar2.displayInfo();             
	}

}
