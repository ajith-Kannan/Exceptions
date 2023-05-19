package Oops3;

public class AcRemote extends Remote {
	String brand;
	int price;
	int noOfBatteries;
	
	public int batterylife() {
		if(noOfBatteries==4) {
			return 5;
		}
		else if(noOfBatteries==2) {
			return 3;
			
		}
		else {
			return 1;
		}
		
	}
	
	public int distance () {
		if(brand.equals("LG")) {
			return 2;
		}
		else {
			return 1;
		}
	}
	

	}
	


