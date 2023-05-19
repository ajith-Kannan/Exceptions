package conditons;

public class CheckMrElseIf {
	public static void main(String[] args) {
		String a = "mr.ragnor";
		if (a.startsWith("mrs")) {
			System.out.println("married women");
		}
		else if (a.startsWith("miss")) {
			System.out.println("unmarried women");
		}
		else if (a.startsWith("mr")) {
			System.out.println("men");
		}
	}

}
