
public class Computer {
	
	//instance variables holds instance data
	private String brand;
	private String model;
	private double price;
	
	//constructor//building computer object
	public Computer(String brand, String model, double myPrice) {
		this.brand = brand;
		this.model= model;
		this.price= price;
	}
	//Accessor Method//"I do this"
	public String getBrand() {
		return brand;
	}
	public String getModel() {
		return model;
}
	public double getPrice(){
		return price;
		
}	//modifier method
	public void setPrice(double price) {
		this.price = price;
		
}
	
	@Override
	public String toString() {
		return " Brand: " + brand + " Model: " + model + " Price: " + price;
	}

		
}
	

