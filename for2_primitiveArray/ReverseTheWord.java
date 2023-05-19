package for2_primitiveArray;

public class ReverseTheWord {
	public static void main(String[] args) {
		String word = "star";
		char []letters = word.toCharArray();
		for(int i=letters.length-1; i>=0; i--) {
			System.out.println(letters[i]);
			
		}
	}

}
