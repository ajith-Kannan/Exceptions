package conditons;

public class CheckElaseIfLowerVal {
	public static void main (String [] args) {
		int a = 7;
		int b = 2;
		int c = 3;
		int d = 4;
		if (a<b&a<c&a<d) {
			System.out.println(a+" is smallest Number");
		}
		else if (b<a&b<c&b<d) {
			System.out.println(b+" is smallest Number");
		}
		else if (c<a&c<b&c<d) {
			System.out.println();
		}
		else {
			System.out.println(c+" is smallest Number");
		}
		
	}

}
