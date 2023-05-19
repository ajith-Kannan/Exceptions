package oops1;

public class UseFan {
	public static void main(String[] args) {
		Coil c  = new Coil();
		
		c.setBrand("ONIDA");
		c.setPrice(59999);
		c.setType("SINGE COIL");
		Fan f = new Fan();
		
		f.setBrand("HAVEELS");
		f.setPrice(59900);
		f.setCoil(c);
		
		System.out.println(f);
		
		
		
		
	}

}
