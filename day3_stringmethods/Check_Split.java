package day3_stringmethods;

public class Check_Split {
	public static void main(String[] args) {
		String word = "Helloworld";
		String []a = word.split("o");
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2].toUpperCase());
		int length = a[0].length();
		System.out.println(length);
	
	
		
		
	}

}
