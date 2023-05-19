package for3;

public class UseClass2 {
	public static void main(String[] args) {
		Shirt1 s1 = new Shirt1();

		s1.brand = "polo";
		s1.colour = "RED";
		s1.price = 1000;

		Shirt1 s2 = new Shirt1();

		s2.brand = "Tommy";
		s2.colour = "white";
		s2.price = 2000;

		Shirt1 s3 = new Shirt1();

		s3.brand = "BASICS";
		s3.colour = "white";
		s3.price = 2500;

		Shirt1[] shirts = { s1, s2, s3 };
		int max = shirts[0].price;
		Shirt1 s = shirts[0];
		
		for (int i=0; i<=shirts.length-1; i++) {
			if (shirts[i].price>max) {
				max=shirts[i].price;
				s=shirts[i];
				
			}
		}
		System.out.println(s.brand+s.colour);
	}

}
