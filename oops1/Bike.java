package oops1;

public class Bike {
	private String brand;
	private String color;
	private int price;

	
	public void setBrand(String a) {
		brand = a;	
	}
	public String getBrand() {
		return brand;
	}
	public void setColor(String b) {
		color = b;
	}
	public String getColor() {
		return color;
	}
	public void setPrice(int c) {
		price = c;
	}
	public int getPrice() {
		return price;
	}
	public String toString() {
		return brand+" "+color+" "+price;
	}
	
}
