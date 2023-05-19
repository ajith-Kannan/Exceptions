package java8Class;

import java.util.Optional;

public class StringOptional {
	public static void main(String[] args) {
		 String val = "Anu";
		 
		 Optional<String> check = Optional.ofNullable(val);
		 System.out.println(check.isPresent());
		 System.out.println(check.isEmpty());
		 System.out.println(check.of("gg"));
		 
		 if(check.isPresent()) {
			 System.out.println(val.toUpperCase());
		 }
		 else {
			 System.out.println("the Value is empty");
		 }
//		 System.out.println(check.get());
		 System.out.println(check.orElse("value is not Present"));
	}
	

}