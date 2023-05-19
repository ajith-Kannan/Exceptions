package for3;

public class UseMobile {
	public static void main(String[] args) {
		Mobile m1 = new Mobile ();
		
		m1.brand = "mi";
		m1.price = 10000;
		m1.color = "Black";
		m1.ram = "5GB";
		
		Mobile m2 = new Mobile ();
		
		m2.brand = "samsung";
		m2.price = 20000;
		m2.color = "White";
		m2.ram = "4GB";
        Mobile m3 = new Mobile ();
		
		m3.brand = "apple";
		m3.price = 50000;
		m3.color = "Red";
		m3.ram = "2GB";
		
        Mobile m4 = new Mobile ();
		
		m4.brand = "vivo";
		m4.price = 30000;
		m4.color = "Res";
		m4.ram = "4GB";
		
		Mobile [] mobiles = new Mobile[4];
		mobiles[0] = m1;
		mobiles[1] = m2;
		mobiles[2] = m3;
		mobiles[3] = m4;
		
		for(int i=0; i<=mobiles.length-1; i++) {
			System.out.println(mobiles[i].brand);
			
		}
	
	
		
	
	}

}
