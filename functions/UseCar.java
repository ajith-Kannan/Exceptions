package functions;

public class UseCar {
	public static void main(String[] args) {
		Car c1 = new Car();

		c1.brand = "tata";
		c1.price = 1000000;
		c1.color = "Black";
		c1.discountPercantage = 10;
		c1.details();
		c1.netPrice();

		Car c2 = new Car();

		c2.brand = "BMW";
		c2.price = 2000000;
		c2.color = "Black";
		c2.discountPercantage = 20;
		c2.details();
		c2.netPrice();
		
		Car c3 = new Car();

		c3.brand = "MUSTANG";
		c3.price = 5000000;
		c3.color = "Black";
		c3.discountPercantage = 20;
		c3.details();
		c3.netPrice();
		
		Car c4 = new Car();

		c4.brand = "AUDI";
		c4.price = 4000000;
		c4.color = "Black";
		c4.discountPercantage = 0;
		c4.details();
		c4.netPrice();

	}

}
