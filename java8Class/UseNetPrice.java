package java8Class;

public class UseNetPrice {
	public static void main(String[] args) {
		
		NetPrice amount = (a,b,c) -> a+(a*b/100)-(a-(a*c/100));
		System.out.println(amount.netPrice(1000, 10, 20));
		

	}

}
