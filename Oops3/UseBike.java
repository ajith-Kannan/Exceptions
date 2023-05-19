package Oops3;

public class UseBike {
	public static void main(String[] args) {
		Bike1 b  =new Bike1();
		b.brand= "YAMAHA";
		b.price = 545599;
		b.vechile = "Bike";
	
	
		b.price = 35677;
		 System.out.println(b.brand+" "+b.price+" "+b.vechile+" "+b.findEngineNumber()+" "+b.findEngineType()+" "+b.findWheels());
	}

}
