package day4;

public class LmsTask1 {
	public static void main(String[] args) {
		String a = args [0];
		String b = args [1];
		
		int num1 = Integer.parseInt(a);
		int num2 = Integer.parseInt(b);
		
		int add = num1+num2;
		System.out.println(add);
		
		int sub = num1-num2;
		System.out.println(sub);
		
		int mul = num1*num2;
		System.out.println(mul);
		
		int div = num1/num2;
		System.out.println(div);
		
		int moud = add%2;
		System.out.println(moud);
		
		
		
	}

}
