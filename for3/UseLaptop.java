package for3;

public class UseLaptop {
	public static void main(String[] args) {
		Laptop l1 = new Laptop ();
		
		l1.brand = "HP";
		l1.price = 100000;
		l1.color = "RED";
		
		Laptop l2 = new Laptop();
		
		l2.brand = "Dell";
		l2.price = 40000;
		l2.color = "BLACK";
		
		Laptop l3 = new Laptop ();
		
		l3.brand ="apple";
		l3.price = 500000;
		l3.color = "Black";
		
		Laptop [] laptops = {l1,l2,l3};
		for(int i=0; i<=laptops.length-1; i++) {
			System.out.println(laptops[i].brand);
		}
	}

}
