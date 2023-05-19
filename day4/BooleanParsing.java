package day4;

public class BooleanParsing {
	public static void main(String[] args) {
		
		String a = args[0];
		String b = args[1];
		
		boolean res1 = Boolean.parseBoolean(a);
		boolean res2 = Boolean.parseBoolean(b);
		 System.out.println(res1+"\n"+res2);
		
	}

}
