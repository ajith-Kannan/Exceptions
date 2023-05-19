package day3_stringmethods;

public class Task2 {
	public static void main(String[] args) {
		String word = "Welcome-to-My-World";
		String []a = word.split("-");
		String res1 = a[2].concat(a[3]).toUpperCase();
		int num = a[1].length();
		String res2 = word.substring(3,7);
		char res3 = word.charAt(6);
		int res4= a.length;
		System.out.println(res1+"\n"+num+"\n"+res2+"\n"+res3+"\n"+res4);
		
		
		
		
		

		
	}

}
