package For1;

public class NameOddOrEven {
	public static void main(String[] args) {
		int a = 1;
		int b = 10;
		for(int i = a; i<=b; i++) {
			if (i%2 == 0) {
				System.out.println(i+"even number");
			}
			else {
				System.out.println(i+"odd number");
			}
		}
	}

}
