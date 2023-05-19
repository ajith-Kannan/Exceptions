package functions;

public class UseCar2 {
	public static void main(String[] args) {
		Car2 c1 = new Car2();

		c1.brand = "tata";
		c1.price = 1000000;

		Car2 c2 = new Car2();

		c2.brand = "BMW";
		c2.price = 2000000;
		
		Car2 c3 = new Car2();

		c3.brand = "AUDI";
		c3.price = 3000000;
		
		Car2 [] cars = {c1,c2,c3};
		Car2 total = c1.min(c2, c2);
		System.out.println(total.brand);
		
	}

}
