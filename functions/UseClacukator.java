package functions;

public class UseClacukator {
	public static void main(String[] args) {
		Calculator c1 = new Calculator();
		c1.brand = "casio";
		c1.price = 100;
		int c = c1.additon();
		c1.division(100, 10);
		c1.subtraction();
		c1.multification(100000.1222222, 100000.222222);
		System.out.println(c);

	}

}
