package ExceptionClass;

public class CheckName {
	public static void main(String[] args) {
		System.out.println("START");
		String name = "sjith";
		try {
		if(name.startsWith("a")) {
			System.out.println("Its Starts With 'A' ");
		}
		else {
			throw new NameException("Not Starts With 'A' ");
		}
		}
		catch(NameException x) {
			x.printStackTrace();
		}
		System.out.println("END");
	}

}
