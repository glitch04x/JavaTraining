package ph.com.bpi.training;

public class Car {
	private String carColor = "Black";
	private String carBrand = "Toyota";
	private String carModel = "Vios";
	private String carPlate = "NoPlate";
	
	public Car(){
	}
	
	public Car(String model, String plate) {
		this.carModel = model;
		this.carPlate = plate;
	}
	
	public String getCarColor() {
		return this.carColor;
	}

	public void setCarColor(String carColor) {
		this.carColor = carColor;
	}

	public String getCarBrand() {
		return this.carBrand;
	}

	public void setCarBrand(String carBrand) {
		this.carBrand = carBrand;
	}

	public String getCarModel() {
		return this.carModel;
	}

	public void setCarModel(String carModel) {
		this.carModel = carModel;
	}

	public String getCarPlate() {
		return this.carPlate;
	}

	public void setCarPlate(String carPlate) {
		this.carPlate = carPlate;
	}
	public void showDetails() {
		System.out.println("====DETAILS====");
		System.out.println("Brand: " + carBrand);
		System.out.println("Model: " + carModel);
		System.out.println("Plate: " + carPlate);
		System.out.println("Color: " + carColor);
		System.out.println("===============");
	}
}
