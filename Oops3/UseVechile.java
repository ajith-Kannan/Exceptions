package Oops3;

public class UseVechile {
	public static void main(String[] args) {
		Car c = new Car();
		c.brand = "BMW";
		c.cc = 450;
		c.fuel = "petrol";
		c.price = 500000;

		c.findMilage(c.fuel);
		c.findNetPrice(50);
		c.findSpeed();

		System.out.println(c.brand + " " + c.cc + " " + c.fuel + " " + c.findMilage(c.fuel) + " " + c.findNetPrice(50));

		Bike b = new Bike();
		b.brand = "YAMAHA";
		b.cc = 300;
		b.color = "black";
		b.price = 50000;

		System.out.println(b.brand + " " + b.cc + " " + b.color + " " + b.price + " " + b.findColor() + " "
				+ b.findMilage("petrol") + b.findNetPrice(10));

	}

}
