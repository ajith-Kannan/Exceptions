package oops2;

public class ElectranicDevice {
	String brand;
	int price;
	
	public String FindPrice(int a) {
		if(a>500) {
			return "costly";
		}
		else {
			return "Not Costly";
			
		}
	}

}
