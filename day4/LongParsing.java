package day4;

public class LongParsing {
	public static void main(String[] args) {
		
		String a = args [0];
		String b = args [1];
		
		long num1 = Long.parseLong(a);
		long num2 = Long.parseLong(b);
		
		long add = num1+num2;
		System.out.println(add);
		
		long sub = num1-num2;
		System.out.println(sub);
		
		long mul = num1*num2;
		System.out.println(mul);
		
		long div = num1/num2;
		System.out.println(div);
		
		long moul= add%2;
		System.out.println(moul);
		
		
	}

	

}
