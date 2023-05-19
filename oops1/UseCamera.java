package oops1;

public class UseCamera {
	public static void main(String[] args) {
		Lens l = new Lens("Canon", 10000);
		Camera c = new Camera("NIKON",5000,"LED",l);
		c.setBrand("EEEE");
		System.out.println(c);
		
		
	}

}
