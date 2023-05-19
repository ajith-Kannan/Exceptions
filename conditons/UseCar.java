package conditons;


public class UseCar {
	public static void main(String[] args) {
		Car c1 = new Car();
		c1.brand = "BMW";
		c1.model = "GTX10";
		c1.price = 500000;
		c1.color = "white";

		Car c2 = new Car();
		c2.brand = "Tata";
		c2.model = "xx23";
		c2.price = 400000;
		c2.color = "red";

		Car c3 = new Car();
		c3.brand = "Honda";
		c3.model = "GTX12";
		c3.price = 300000;
		c3.color = "Green";

		Car c4 = new Car();
		c4.brand = "Jaguar";
		c4.model = "GTX15";
		c4.price = 200000;
		c4.color = "white";

		Car c5 = new Car();
		c5.brand = "Luxus";
		c5.model = "GTX11";
		c5.price = 550000;
		c5.color = "white";

		if (c1.price > c2.price && c1.price > c3.price && c1.price > c4.price && c1.price > c5.price) {
			System.out.println(c1.brand);

		} else if (c2.price > c1.price && c2.price > c3.price && c2.price > c4.price && c2.price > c5.price) {
			System.out.println(c2.brand);
		} else if (c3.price > c1.price && c3.price > c2.price && c3.price > c4.price && c3.price > c5.price) {
			System.out.println(c3.brand);
		} else if (c4.price > c1.price && c4.price > c2.price && c4.price > c3.price && c4.price > c5.price) {
			System.out.println(c4.brand);
		} else if (c5.price > c1.price && c5.price > c2.price && c5.price > c3.price && c5.price > c4.price) {
			System.out.println(c5.brand);

		} else {
			System.out.println("wrong input");

		}

		if (c1.price < c2.price && c1.price < c3.price && c1.price < c4.price && c1.price < c5.price) {
			System.out.println(c1.model);
		} else if (c2.price < c1.price && c2.price < c3.price && c2.price < c4.price && c2.price < c5.price) {
			System.out.println(c2.model);
		} else if (c3.price < c1.price && c3.price < c2.price && c3.price < c4.price && c3.price < c5.price) {
			System.out.println(c3.model);
		} else if (c4.price < c1.price && c4.price < c2.price && c4.price < c3.price && c4.price < c5.price) {
			System.out.println(c4.model);
		} else if (c5.price < c1.price && c5.price < c2.price && c5.price < c3.price && c5.price < c4.price) {
			System.out.println(c5.model);
		}

		else {
			System.out.println("wrong input");
		}

	}

}
