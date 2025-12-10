package M2_Activity6;

public class MyApplication {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
        Car car = new Car("Ford", 4);
        Truck truck = new Truck("Suzuki", 8);
            
        car.startEngine();
        car.refuel();

        System.out.println("");
        
        truck.startEngine();
        truck.refuel();
        
        System.out.println("");

        destroyVehicle(car);
        destroyVehicle(truck);
     }

     public static void destroyVehicle(Vehicle vehicle) {
         vehicle.destroy();
     }
 }