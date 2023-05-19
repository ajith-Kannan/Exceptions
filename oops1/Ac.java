package oops1;

public class Ac {
	private String brand;
	private String model;
	private int price;
	private Compressor compressor;
	
	public void setBrand(String b) {
		brand = b;
		
	}
	public String getBrand() {
		return brand;
	}
	public void setModel(String m) {
		model = m;
	}
	public String getModel() {
		return model;
	}
	public void setPrice(int p) {
		price = p;
	}
	public int getPrice() {
		return price;
	}
	public void setCompressor(Compressor c) {
		compressor = c;
	}
	public Compressor getCompressor() {
		return compressor;
	}
	
	

}
