package functions;

public class UseBike {
	public static void main(String[] args) {
		Bike b1 = new Bike();

		b1.brand = "Yamaha";
		b1.price = 169996;
		b1.color = "Black";
		
		Bike b2 = new Bike();

		b2.brand = "TVS";
		b2.price = 150001;
		b2.color = "Black";
		
		Bike b3 = new Bike();

		b3.brand = "BMW";
		b3.price = 2230000;
		b3.color = "Black";
		
		b1.even(b1.price);
		b2.even(b2.price);
		b3.even(b3.price);
		
		
		

		
	}

}
