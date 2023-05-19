package ExceptionClass;

public class NumberFormatProgram {
	public static void main(String[] args) { 
		
		System.out.println("START");
		
		try {
		String a = "36ar";
		int b = Integer.parseInt(a);
		
		System.out.println(b);
		}
		catch(NumberFormatException c) {
			System.out.println(c);
		}
		
		System.out.println("END");
		
	}

}
