package Oops3;

public class Car implements Vechile {
	String brand;
	int price;
	int cc;
	String fuel;
	
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
	
	public int findSpeed() {
		if(cc <= 500) {
			return 100;
		}
		else if(cc> 500 && cc<1000) {
			return 120;
		}
		else {
		return 50;
	}
	
}

		
	}



