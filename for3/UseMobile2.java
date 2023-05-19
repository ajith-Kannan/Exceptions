package for3;

public class UseMobile2 {
	public static void main(String[] args) {
		Mobile2 m1 = new Mobile2();

		m1.brand = "mi";
		m1.price = 5000;
		m1.color = "Black";


		Mobile2 m2 = new Mobile2();

		m2.brand = "samsung";
		m2.price = 20000;
		m2.color = "White";
	
		Mobile2 m3 = new Mobile2();

		m3.brand = "apple";
		m3.price = 50000;
		m3.color = "Red";
		
		Mobile2 [] mobiles = {m1,m2,m3};
		for(int i=0; i<=mobiles.length-1; i++) {
			if(mobiles[i].price %2 == 0) {
				System.out.println(mobiles[i].price+2000);
				
				
			}
			
		}
		for(int i=0; i<=mobiles.length-1; i++)
			if(mobiles[i].brand.contains("a")|| mobiles[i].brand.contains("e")||mobiles[i].brand.contains("i")|| mobiles[i].brand.contains("o")||mobiles[i].brand.contains("u")&& mobiles[i].price>10000) {
				System.out.println(mobiles[i].brand);
			}
				
	
	}

}
