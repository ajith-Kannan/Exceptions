package Oops3;

public class Bike implements Vechile {
	String brand;
	int price;
	String color;
	int cc;
	
	public int findMilage(String fuel) {
		if(fuel.equals("Petrol")) {
			return 20;
		}
		else {
			return 10;
		}
		
	}
	public int findNetPrice(int tax) {
		return price+price*tax/100;
	}
	
	public String findColor() {
		if(color.equals("black")) {
		return "BLACK HORSE";
		}
		else {
			return "Normal Car";
			
		}
	}
	
	
	

}
