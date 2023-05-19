package functions;

public class Car1 {
	String brand;
	int price;
	String color;
	
	public void vowelContains(Car[]a) {
		for(int i=0; i<=a.length-1; i++) {
			if(a[i].brand.contains("a")|| a[i].brand.contains("e")||a[i].brand.contains("i")||a[i].brand.contains("o")||a[i].brand.contains("u")) {
				System.out.println(a[i].brand);
			}
		}
	}

}
