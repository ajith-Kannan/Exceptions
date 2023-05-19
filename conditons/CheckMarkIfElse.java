package conditons;

public class CheckMarkIfElse {
	public static void main(String[] args) {
		int mark = 35;
		if (mark >= 1 && mark < 35) {
			System.out.println("fail");

		} else if (mark >= 35 && mark < 50) {
			System.out.println("c grade");

		} else if (mark >= 50 && mark < 70) {
			System.out.println("B grade");
		} else if (mark >= 70 && mark < 90) {
			System.out.println("A grade");

		} else if (mark >= 90 && mark < 100) {
			System.out.println("s grade");
		} else {
			System.out.println("Wrong input");
		}
	}

}
