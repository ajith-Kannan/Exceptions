package oops1;

public class UseAc {
	public static void main(String[] args) {

		Compressor c = new Compressor();
		c.setCapcity(100);
		c.setPhaseType("Single");
		c.setPrice(1500);

		Ac ac = new Ac();
		ac.setBrand("LG");
		ac.setModel("COOL");
		ac.setPrice(200000);
		ac.setCompressor(c);

		System.out.println(ac.getBrand() + ", " + ac.getModel());
		System.out.println(ac.getCompressor().getCapacity() + ", " + ac.getCompressor().getPhaseType());
	}

}
 