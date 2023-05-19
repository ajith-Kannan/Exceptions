package oops1;

public class UseMobile {
	public static void main(String[] args) {
		
		Battery b = new Battery();
		b.setCapcity(5000);
		b.setPrice(2000);
		b.setType("lithium");
		
		Mobile m = new Mobile();
		m.setBrand("ViVO");
		m.setPrice(15000);
		m.setColor("red");
		m.setBattery(b);
		
		System.out.println(m.getBrand()+"\n"+m.getPrice()+"\n"+m.getColor());
		System.out.println(m.getBattery().getCapacity()+"\n"+m.getBattery().getPrice()+"\n"+m.getBattery().getType());
	}

}
