package oops1;

public class UseLaptop {
	public static void main(String[] args) {
		Display d = new Display(5000,5.5f,"LED");
		Laptop l = new Laptop("ASUS",50000,5,d);
		
		System.out.println(l);
	}

}
