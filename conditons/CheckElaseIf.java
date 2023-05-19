package conditons;

public class CheckElaseIf {
	public static void main (String []args) {
		int a = 9;
		int b = 7;
		int c = 3;
		if (a>b&a>c) {
			System.out.println(a+" is greater");
			
		}
		else if (b>a&b>c) {
			System.out.println(b+" is greater");
		}
		else  {
			System.out.println(c+" is greater");
		}
	}

}
