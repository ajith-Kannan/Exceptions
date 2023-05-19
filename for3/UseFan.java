package for3;

public class UseFan {
	public static void main(String[] args) {

		Fan f1 = new Fan();

		f1.brand = "havels";
		f1.speed = 400;
		f1.color = "RED";

		Fan f2 = new Fan();

		f2.brand = "croma";
		f2.speed = 200;
		f2.color = "black";
		Fan f3 = new Fan();

		f3.brand = "tata";
		f3.speed = 100;
		f3.color = "blue";
		
		Fan [] fans = {f1,f2,f3};
		
		for(int i=fans.length-1; i>=0; i--) {
			System.out.println(fans[i].brand);
		}

	}
}