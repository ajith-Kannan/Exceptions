package oops2;

public class Bike {
	String brand;
	int price;
	
	public void setBrand(String a) {
		 brand=a;	
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
	
	public Bike(String a,int b) {
		brand=a;
		price=b;
	}
	public String toString() {
		return brand+", "+price;
	}
	
	public int findNetPrice(int tax) {
		return price+price*tax/100;
		
	}
	public int findMilage(String fuel) {
		if(fuel.equals("petrol")) {
			return 35;
		}
		else {
			return 20;
		}
	}

}
