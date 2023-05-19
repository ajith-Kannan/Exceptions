package conditons;

public class CheckVowelsIfElse {
	public static void main(String[] args) {
		String word = "Something";
		if (word.contains("a") || word.contains("e") || word.contains("i") || word.contains("o")
				|| word.contains("u")) {
			System.out.println(word + " is vowels present");
    	}
		else {
			System.out.println(word+ " is not vowels present");
		}
	}

} 
