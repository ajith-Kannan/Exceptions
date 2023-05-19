package ExceptionClass;

public class Sample {
	public static void main(String[] args) {
		System.out.println("START");
		try {
		int a = 10;
		int b = 0;
		System.out.println(a/b);
		}
		
		finally {
			System.err.println("THANKYOU");
//		catch(Exception a) {
//			System.err.println("Error Occurs");
//			System.out.println(a);
//			a.printStackTrace();
		}
		System.out.println("END");
	}

}
