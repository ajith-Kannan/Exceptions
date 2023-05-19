package oops1;

public class Coil {
	private String brand;
	private int price ;
	private String type;
	
	public void setBrand(String a) {
		brand = a;	
	}
	public void setPrice(int b) {
		price = b;
	}
	public void setType(String c) {
		type =c;
	}
	public String toString() {
		return brand+" "+price+" "+type;
	}

}
