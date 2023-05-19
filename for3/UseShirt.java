package for3;

public class UseShirt {
	public static void main(String[] args) {
		Shirt s1 = new Shirt();

		s1.brand = "polo";
		s1.material = "Cotten";
		s1.colour = "RED";
		s1.price = 1000;

		Shirt s2 = new Shirt();

		s2.brand = "Tommy";
		s2.material = "Cotten";
		s2.colour = "white";
		s2.price = 2000;

		Shirt s3 = new Shirt();

		s3.brand = "BASICS";
		s3.material = "Cotten";
		s3.colour = "white";
		s3.price = 2500;

		Shirt[] shirts = { s1, s2, s3 };
		for (Shirt result : shirts) {
			System.out.println(result.brand + " " + result.colour + " " + result.material + " " + result.price);
		}

		int total = s1.price + s2.price + s3.price;
		System.out.println(total);

	}

}
