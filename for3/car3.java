package for3;

public class car3 {
	public static void main(String[] args) {
		Car1 c1 = new Car1();

		c1.brand = "tata";
		c1.price = 1000000;
		c1.color = "Black";
		
		Car1 c2 = new Car1();

		c2.brand = "bmw";
		c2.price = 2000000;
		c2.color = "White";
		
		Car1 c3 = new Car1();

		c3.brand = "mustang";
		c3.price = 6000000;
		c3.color = "RED";
		
		Car1 [] cars = {c1,c2,c3};
		for(int i=0; i<=cars.length-1; i++) {
			if(cars[i].brand.contains("a")|| cars[i].brand.contains("e")||cars[i].brand.contains("i")|| cars[i].brand.contains("o")||cars[i].brand.contains("u")) {
				System.out.println(cars[i].brand);
			}
		}

		for(Car1 c : cars) {
			if(c.color.equalsIgnoreCase("White")) {
				System.out.println(c.brand);
			
				
			}
		}
	}

}
