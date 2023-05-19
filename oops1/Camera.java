package oops1;

public class Camera {
	private String brand;
	private int price;
	private String model;
	private Lens lens;

	public void setBrand(String a) {
		brand = a;

	}

	public String getBrand() {
		return brand;
	}

	public void setPrice(int b) {
		price = b;
	}

	public int getPrice() {
		return price;
	}

	public void setModel(String c) {
		model = c;
	}

	public String getModel() {
		return model;
	}

	public void setLens(Lens d) {
		lens = d;
	}

	public Lens getLens() {
		return lens;
	}
	
	public Camera (String a, int b, String c,Lens d ) {
		brand = a;
		price = b;
		model = c;
		lens = d;
	}
	public String toString() {
		return brand+" "+price+" "+model+" "+lens;
	}

}
