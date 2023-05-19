package conditons;

public class CheckIfisUpperCase {
	public static void main (String[]args) {
		String name = "Ragnor";
		String name2 = name.toUpperCase();
		
		if (name.equals(name2)) {
			System.out.println("is Upper  case ");
		}
		else {
			System.out.println("is not Upper case");
		}
	}

}
 