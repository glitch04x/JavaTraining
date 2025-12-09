package M2_Activity6;

public class MainApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car kotse = new Car();
		Truck trak = new Truck(4,"Ford");

		kotse.setNumberOfWheels(4);
		kotse.setBrand("Toyota");
		
		kotse.refuel();
		kotse.startEngine();
		
		
		trak.refuel();
		trak.startEngine();
		
		destroyVehicle(kotse);
		destroyVehicle(trak);
		
	}
	
	public static void destroyVehicle(Vehicle vehicle ) {
		vehicle.destroy();
	}

}
