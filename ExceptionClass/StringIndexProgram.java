package ExceptionClass;

public class StringIndexProgram {
	public static void main(String[] args) {
		System.out.println("START");
		
		try {
		String  a = "AJITH";
		
		System.out.println(a.charAt(8));
		}
		catch(StringIndexOutOfBoundsException a) {
			a.printStackTrace();
			
		}
		
		System.out.println("END");
	}

}
