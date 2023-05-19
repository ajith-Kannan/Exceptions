package for3;

public class UseAc {
	public static void main(String[] args) {
		Ac ac1 = new Ac();

		ac1.brand = "tata";
		ac1.price = 15000;
		ac1.color = "Black";

		Ac ac2 = new Ac();

		ac2.brand = "Lg";
		ac2.price = 20500;
		ac2.color = "Black";

		Ac ac3 = new Ac();

		ac3.brand = "sony";
		ac3.price = 5500;
		ac3.color = "Black";

		Ac[] acs = { ac1, ac2, ac3 };
		for (int i = 0; i <= acs.length - 1; i++) {
			if (acs[i].price > 10000) {
				System.out.println(acs[i].price+(acs[i].price*10/100));
			} 
			else if (acs[i].price > 20000) {
				System.out.println(acs[i].price +(acs[i].price*20/100));
			}
			else {
				System.out.println(acs[i].price);
			}
		}
	}
}
