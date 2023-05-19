package functions;

public class Car2 {
	String brand;
	int price;
	
	public Car2 min(Car2 a, Car2 b) {
		if(a.price>b.price) {
			return b;			
			}
		else {
			return a;
		}
	}

}
