package collection3_StreamApi;

public class Ac {
	private String brand;
	private String model;
	private int price;
	private int capacity;
	private String phaseType;
	private int year;
	

	public void setBrand(String brand) {
		this.brand = brand;
		
	}
	public String getBrand() {
		return brand;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getCapacity() {
		return capacity;
	}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	public String getPhaseType() {
		return phaseType;
	}
	public void setPhaseType(String phaseType) {
		this.phaseType = phaseType;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public Ac(String brand, String model, int price, int capacity, String phaseType, int year) {
		super();
		this.brand = brand;
		this.model = model;
		this.price = price;
		this.capacity = capacity;
		this.phaseType = phaseType;
		this.year = year;
	}
	@Override
	public String toString() {
		return "Ac [brand=" + brand + ", model=" + model + ", price=" + price + ", capacity=" + capacity
				+ ", phaseType=" + phaseType + ", year=" + year + "]";
	}
	
	

}
