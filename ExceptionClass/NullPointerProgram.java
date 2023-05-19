package ExceptionClass;

public class NullPointerProgram {
	public static void main(String[] args) {
		System.out.println("WELCOME");
		try {
		String a = null;
		System.out.println(a.toLowerCase());
		}
		catch(NullPointerException a) {
			a.printStackTrace();
		}
		
		System.out.println("END");
		
	}

}
