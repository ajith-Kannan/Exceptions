package ExceptionClass;

public class VoterAge {
	public static void main(String[] args) throws AgeException {
		System.out.println("START");
		int age = 14;
		try {
			if (age < 18) {
				throw new AgeException("Not Eligible");
			} else {
				System.out.println("ELIGIBLE");
			}
		}

		catch (AgeException d) {
			System.out.println("ERROR OCCURS");

		}
		System.out.println("END");
	}
}
