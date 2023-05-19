package test1;

public class Convert_Lower_Case {
	public static void main(String[] args) {
		String word = "hello World";
		String res = word.toLowerCase();
		System.out.println(res);
		
		String res1 = word.toUpperCase();
		System.out.println(res1);
		
		int length = word.length();
		System.out.println(length);
		
		String concat = word.concat(" Pepole");
		System.out.println(concat);
		
		boolean contain = word.contains("hello");
		System.out.println(contain);
		
		boolean starts = word.startsWith("hello");
		System.out.println(starts);
		
		boolean ends = word.endsWith("ld");
		System.out.println(ends);
		
		boolean equal = word.equals("hello World");
		System.out.println(equal);
		
		boolean equalCase = word.equalsIgnoreCase("hello world");
		System.out.println(equalCase);
		
		char char1 = word.charAt(2);
		System.out.println(char1);
		
		
			
		
		
		
	}

}
