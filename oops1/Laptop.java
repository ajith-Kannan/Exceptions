package oops1;

public class Laptop {
	private String brand;
	private int price;
	private int ram;
	private Display display;
	
	public Laptop (String brand, int price, int ram, Display display) {
		this.brand = brand;
		this.price = price;
		this.ram = ram;
		this.display = display;
	}
	public String toString() {
		return brand+" "+price+" "+ram+" "+display;
	}

}
