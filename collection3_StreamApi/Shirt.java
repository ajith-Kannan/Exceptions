package collection3_StreamApi;

public class Shirt {
	private String brand;
	private String size;
	private int price;
	private String color;
	private String material;
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getMaterial() {
		return material;
	}
	public void setMaterial(String material) {
		this.material = material;
	}
	public Shirt(String brand, String size, int price, String color, String material) {
		super();
		this.brand = brand;
		this.size = size;
		this.price = price;
		this.color = color;
		this.material = material;
	}
	@Override
	public String toString() {
		return "Shirt [brand=" + brand + ", size=" + size + ", price=" + price + ", color=" + color + ", material="
				+ material + "]";
	}
	
	
	

}
