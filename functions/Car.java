package functions;

public class Car {
	String brand;
	int price;
	String color;
	int discountPercantage;
	
	
	public void netPrice() {
		System.out.println(price-(price*discountPercantage/100));
	}
	
	public void details() {
		System.out.println(brand+" "+price+color+discountPercantage);

	}

}
