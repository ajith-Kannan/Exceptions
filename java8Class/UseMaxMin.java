package java8Class;

public class UseMaxMin {
	public static void main(String[] args) {
		
		int [] values = {10,-5,6,8,9};
		
		MaxMin max = Methods::find1;
		System.out.println(max.find(values));
		
		MaxMin min = new Methods()::find;
		System.out.println(min.find(values));
	}

}
