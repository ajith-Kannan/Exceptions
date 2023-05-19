package collection2_Hashmap;

public class Car {
	private String brand;
	private int price;
	private String model;
	private String color;
	private  String regNumber;
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getRegNumber() {
		return regNumber;
	}
	public void setRegNumber(String regNumber) {
		this.regNumber = regNumber;
	}
	public Car(String brand, int price, String model, String color, String regNumber) {
		super();
		this.brand = brand;
		this.price = price;
		this.model = model;
		this.color = color;
		this.regNumber = regNumber;
	}
	@Override
	public String toString() {
		return "Car [brand=" + brand + ", price=" + price + ", model=" + model + ", color=" + color + ", regNumber="
				+ regNumber + "]";
	}
	
	
	

}
