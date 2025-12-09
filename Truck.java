package M2_Activity6;

public class Truck extends Vehicle implements Refuelable {
	
	Truck(){
		super();
	}
	
	Truck(int numberOfWheels, String brand) {
		super(numberOfWheels, brand);
	}

	@Override
	public void refuel() {
		System.out.println("Refueling the " + this.getNumberOfWheels() + " wheeled " + this.getBrand() + " Truck");
	}

	@Override
	void startEngine() {
		System.out.println("Truck engine is starting...");
	}
	
	@Override
	void destroy() {
		System.out.println("Destroying " + this.getNumberOfWheels() + " wheeled " + this.getBrand());
	}
}
