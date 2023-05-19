package oops1;

public class Lens {
	private String brand;
	private int price;

	public void setBrand(String a) {
		brand = a;

	}

	public String getBrand() {
		return brand;
	}

	public void setPrice(int b) {
		price = b;
	}

	public int getPrice() {
		return price;
	}

	public Lens(String a, int b) {
		brand = a;
		price = b;
	}

	public String toString() {
		return brand + " " + price;
	}

}
