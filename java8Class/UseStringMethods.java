package java8Class;

public class UseStringMethods {
	public static void main(String[] args) {
		
		String val = "Ajith";
		
		StringMethods isEqual = val::equals;
		System.out.println(isEqual.operate("Ajith"));
		
		StringMethods isStart = val::startsWith;
		System.out.println(isStart.operate("A"));
		
		StringMethods isCase = val :: equalsIgnoreCase;
		System.out.println(isCase.operate("AJITH"));
		
		StringMethods isEnds = val :: endsWith;
		System.out.println(isEnds.operate("h"));
		
			
		
	}
	
	

}
