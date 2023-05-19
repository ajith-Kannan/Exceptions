package oops1;

public class UseCar {
	public static void main(String[] args) {
		
		Engine e = new Engine();
		e.brand = "Ford Engine";
		e.price = 5000;
		e.enginecc = 1500;
		
		Car c = new Car();
		c.brand = "Ford";
		c.price = 5000000;
		c.color = "WHite";
		c.engine = e;
		
		System.out.println(c.brand+", "+c.engine.enginecc);
	}

}
