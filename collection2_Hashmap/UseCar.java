package collection2_Hashmap;
import java.util.HashMap;
public class UseCar {
	public static void main(String[] args) {
		
		Car c1 = new Car("BMW",1000000,"GT-314","Black","TN 01 AR 5676");
		Car c2 = new Car("KIA",2000000,"HE-563","RED","TN 02 VE 3421");
		Car c3 = new Car("TATA",100000,"NANO","ORANGE","TN 03 FR 4338");
		Car c4 = new Car("AUDI",250000,"XXE-234","White","TN 45 GH 3219");
		Car c5 = new Car("BMW",1500000,"SUV-08","GREY","TN 49 HY 2453");
		Car c6 = new Car("BENZ",300000,"XT-564","BLACK","TN 34 YT 6547");
		
		HashMap <String,Car> cars = new HashMap<>();
		cars.put(c1.getRegNumber(), c1);
		cars.put(c2.getRegNumber(), c2);
		cars.put(c3.getRegNumber(), c3);
		cars.put(c4.getRegNumber(), c4);
		cars.put(c5.getRegNumber(), c5);
		cars.put(c6.getRegNumber(), c6);
		
		cars.keySet().forEach(keys-> System.out.println(keys));
		
		for(Car value : cars.values()) {
			System.out.println(value);
			
		}
		for(String value1 : cars.keySet()) {
			System.out.println(value1+" "+cars.get(value1));
			
			
		}
		System.out.println();
		
		cars.values().forEach(a-> {
			if(!a.getColor().equals("White")) {
			System.out.println(a);
			}
			
		});
		System.out.println("0");
		for(String b : cars.keySet()) {
			if(cars.get(b).getBrand().equals("yamaha") && cars.get(b).getPrice()>500000) {
				System.out.println(cars.get(b));
			}
		}
		
		System.out.println();
		Car temp = c1;
		
		for(Car x : cars.values()) {
			if(c1.getPrice()>temp.getPrice()) {
				
				temp = x;	
			}
		}
		System.out.println(temp);
		
		HashMap <String,Car> tnCars = new HashMap<>();
		for(String c : cars.keySet()) {
			if(cars.get(c).getRegNumber().startsWith("TN")){
				tnCars.put(c, cars.get(c));
				
			}
		}
		System.out.println(tnCars);
	}

}
