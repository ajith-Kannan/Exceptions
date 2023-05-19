package for3;

public class UseCar {
	public static void main(String[] args) {
        Car c1 = new Car ();
		
		c1.brand = "tata";
		c1.price = 1000000;
		c1.color = "Black";
		c1.discountAmount =50000;
		c1.netPrice = c1.price - c1.discountAmount;
		
		
		Car c2 = new Car ();
		
		c2.brand = "BMW";
		c2.price = 2000000;
		c2.color = "Black";
		c2.discountAmount =40000;
		c2.netPrice = c2.price - c2.discountAmount;
		
		Car c3 = new Car ();
		
		c3.brand = "AUDI";
		c3.price = 4000000;
		c3.color = "White";
		c3.discountAmount =60000;
		c3.netPrice = c3.price - c3.discountAmount;
		
		Car c4 = new Car ();
		
		c4.brand = "MUSTANG";
		c4.price = 10000000;
		c4.color = "Black";
		c4.discountAmount =80000;
		c4.netPrice = c4.price - c4.discountAmount;
		
		Car [] cars = new Car[4];
		cars[0] = c1;
		cars[1] = c2;
		cars[2] = c3;
		cars[3] = c4;
		for(Car total : cars) {
			System.out.println(total.brand);
		}
		
	}

}
