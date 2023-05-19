package functions;

public class Calculator {
	String brand;
	int price;
	
	public int additon () {
		int a=5;
		int b=10;
		return a+b;
	}
	
	public void subtraction () {
		int a = 10;
		int b = 5;
		System.out.println(a-b);
	}
	
	public  double multification(double a , double b) {
		double c = a*b;
		return c;
		
	}
	public void division (int a ,int b) {
		System.out.println(a/b);
	}

}
