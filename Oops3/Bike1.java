package Oops3;

public class Bike1 implements Vechile1 , AutoMobile {
	String vechile;
	String brand;
	int price;
	
	
	public int findWheels() {
		if(vechile.equals("bike")) {
			return 2;
			
		}
		else {
			return 4;
		}
	}
	
	public int findEngineNumber() {
		return 56431186;
	}
	
	public String findEngineType() {
		if(vechile.equalsIgnoreCase("BIKE")) {
			return "2 Stroke Engine";
		}
		else {
			return "4 Stroke Engine";
		}
	}

		
	
	

}
