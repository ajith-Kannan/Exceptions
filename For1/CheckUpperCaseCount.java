package For1;

public class CheckUpperCaseCount {
	public static void main(String[] args) {
		String word = "DhoNi";
		int count = 0;
		for (int i = 0; i <= word.length() - 1; i++) {
			if (word.charAt(i) >= 'A' && word.charAt(i) <= 'Z') {
				count = count + 1;

			}
			
		}
		System.out.println(count);

	}

}
