package java8Class;

public class Example {
	
	static int value = 0;
	
	static { 
		System.out.println("it is a Static block");
	}
	public Example () {
		value ++;
		
		System.out.println(value);
	}

}
