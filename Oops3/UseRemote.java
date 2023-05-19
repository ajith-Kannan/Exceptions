package Oops3;

public class UseRemote {
	public static void main(String[] args) {
		AcRemote ac = new AcRemote();
		
		ac.brand = "LG";
		ac.noOfBatteries = 2;
		ac.price = 100;
		System.out.println(ac.brand+" "+ac.noOfBatteries+" " +ac.batterylife()+" "+ac.distance()+ac.price +ac.onOffFunction());
		
		
	}

	
	
	
	
	
	
	
}
