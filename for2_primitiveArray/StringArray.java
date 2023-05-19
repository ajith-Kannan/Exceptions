package for2_primitiveArray;

public class StringArray {
	public static void main(String[] args) {
		String[] words = { "birds", "trees", "bikes", "chair", "tables", "pencil" };
		int count = 0;

		for (int i = 0; i <= words.length - 1; i++) {
			if (words[i].contains("a") || words[i].contains("e") || words[i].contains("i") || words[i].contains("o")
					|| words[i].contains("u")) {
				System.out.println(words[i] + " is contains vowels");

			}

		}

		for (int i = 0; i <= words.length - 1; i++) {
			if (words[i].endsWith("s")) {
				count = count + 1;
			}
		}
		System.out.println(count);

		for (int i = 0; i <= words.length - 1; i++) {
			if (words[i].length() > 5) {
				System.out.println(words[i]);

			}
		}
		
		for(int i=0; i<=words.length-1; i++) {
			System.out.println(words[i].charAt(0));
		}
		
		for(int i=0; i<=words.length-1; i++) {
			System.out.println(words[i].charAt(words[i].length()-1));
		}

	}

}
