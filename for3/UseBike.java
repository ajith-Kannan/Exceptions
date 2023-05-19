package for3;

public class UseBike {
	public static void main(String[] args) {
		Bike b1 = new Bike();

		b1.brand = "YAmaha";
		b1.price = 100000;
		b1.taxPercentage = 10;
		b1.netPrice = b1.price + (b1.price + b1.taxPercentage / 100);

		Bike b2 = new Bike();

		b2.brand = "R15";
		b2.price = 500000;
		b2.taxPercentage = 20;
		b2.netPrice = b2.price + (b2.price + b2.taxPercentage / 100);
		
		Bike b3 = new Bike();

		b3.brand = "BMW";
		b3.price = 600000;
		b3.taxPercentage = 50;
		b3.netPrice = b3.price + (b3.price + b3.taxPercentage / 100);
		
		Bike b4 = new Bike();

		b4.brand = "HONDA";
		b4.price = 300000;
		b4.taxPercentage = 30;
		b4.netPrice = b4.price + (b4.price + b4.taxPercentage / 100);
		
		Bike [] bikes = {b1,b2,b3,b4};
		for(Bike result : bikes) {
			System.out.println(result.brand);
		}
		
		for(int i=0; i<=bikes.length-1; i++) {
			System.out.println(bikes[i].brand);
		}


	}

}
