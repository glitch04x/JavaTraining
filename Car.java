package M2_Activity6;

public class Car extends Vehicle implements Refuelable {
	
	Car(){
		super();
	}
	
	Car(int numberOfWheels, String brand) {
		super(numberOfWheels, brand);
	}

	@Override
	public void refuel() {
		System.out.println("Refueling the " + this.getNumberOfWheels() + " wheeled " + this.getBrand() + " Car");
	}

	@Override
	void startEngine() {
		System.out.println("Car engine is starting...");
	}

	@Override
	void destroy() {
		System.out.println("Destroying " + this.getNumberOfWheels() + " wheeled " + this.getBrand());
	}
}
