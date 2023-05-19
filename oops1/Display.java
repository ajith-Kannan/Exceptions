package oops1;

public class Display {
	private int price;
	private float size;
	private String type;
	
	public Display (int a, float b, String c) {
		price = a;
		size = b;
		type = c;
		
	}
	public String toString() {
		return price+" "+size+" "+type;
	}

}
