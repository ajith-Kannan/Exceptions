package oops1;

public class UseBike {
	public static void main(String[] args) {
		Bike b1 = new Bike();
		b1.setBrand("YAMAHA");
		b1.setColor("RED");
		b1.setPrice(200890);
		
		Bike b2 = new Bike();
		b2.setBrand("HONDA");
		b2.setColor("WHITE");
		b2.setPrice(477588);
		
		Bike b3 = new Bike();
		b3.setBrand("BMW");
		b3.setColor("BLACK");
		b3.setPrice(355679);
		
		Bike[]bikes = {b1,b2,b3};
		
		for(int i=0; i<=bikes.length-1; i++) {
			if(bikes[i].getColor().equals("BLACK")) {
				System.out.println(bikes[i]);
			}
			
		}
		int a = bikes[0].getPrice();
		Bike b = bikes[0];
		for(int i=0; i<=bikes.length-1; i++) {
			if(bikes[i].getPrice()>a) {
				a=bikes[i].getPrice();
				b=bikes[i];
			}	
		
		}
		System.out.println(b);
	
	}

}