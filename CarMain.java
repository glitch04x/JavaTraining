package ph.com.bpi.training;

public class CarMain{
    public static void main(String[] args) {
		Car sakin = new Car();
		Car kanya = new Car("Mirage","ABC1234");
		sakin.setCarPlate("NGR3212");
		sakin.setCarColor("White");

		System.out.println("\nsakin");
		sakin.showDetails();
		System.out.println("\nkanya");
		kanya.showDetails();
		
    }
	
}
