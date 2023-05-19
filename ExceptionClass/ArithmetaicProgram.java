package ExceptionClass;

public class ArithmetaicProgram {
	public static void main(String[] args) {
		System.out.println("START");
		try {
		int a = 50;
		int b =0;
		
		System.out.println(a/b);
		}
		catch(ArithmeticException a) {
			System.out.println("Error found");
		}
		System.out.println("END");
	}
	

}
