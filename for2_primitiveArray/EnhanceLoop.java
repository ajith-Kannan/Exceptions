package for2_primitiveArray;

public class EnhanceLoop {
	public static void main(String[] args) {
		float [] values = {10.50f,50.20f,50.10f,10.10f};
		float mul = 1;
		
		for(float m : values ) {
			mul = mul*m;	
			}
		System.out.println(mul);
		}		
	}


