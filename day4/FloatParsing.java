package day4;

public class FloatParsing {
	public static void main (String []args) {
		
		String a = args [0];
		String b = args [1];
		
		float num1 = Float.parseFloat(a);
		float num2 = Float.parseFloat(b);
		
		float total = num1+num2;
		System.out.println(total);
		
		float sub = num1-num2;
		System.out.println(sub);
		
		float mul = num1*num2;
		System.out.println(mul);
		
		float div = num1/num2;
		System.out.println(div);
		
		float mould = total%2;
		System.out.println(mould);
		
		
	}
	
	
	

}
