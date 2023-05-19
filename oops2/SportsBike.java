package oops2;

public class SportsBike extends Bike {
	private String model;
	private String color;
	
	public void setmodel(String b) {
		 brand=b;	
	}
	public String getModel() {
		return brand;	
	}
	
	public void setColor(String d) {
		color = d;
	}
	public String getColor() {
		return color;	
	}
	
	public SportsBike (String brand,int price,String a,String b) {
		super(brand,price);
		model = a;
		color = b;
		
	}
	public String toString () {
		return model+", "+color+","+super.brand+super.price;
		
	}
	
	public String findGrip(String typeOfLand) {
		if (typeOfLand.equals("sand")) {
			return "smallGrip";
			
			
		}
		
		else {
			return "very tight";
			
		}
	}
	

}
