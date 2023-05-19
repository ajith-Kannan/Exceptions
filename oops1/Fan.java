package oops1;

public class Fan {
	private String brand;
	private int price;
	private Coil coil;
	
	public void setBrand(String a) {
		brand = a;
		
	}
	public void setPrice(int b) {
		price = b;
	}
	public void setCoil(Coil c) {
		coil = c;
	}
	
	public String toString() {
		return brand+" "+price+"\n"+coil;
		
	
	}

}
