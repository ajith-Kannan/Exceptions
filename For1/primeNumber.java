package For1;

public class primeNumber {
	public static void main(String[] args) {
		int num = 8;
		boolean res = true;
		
		for(int i = 2; i<num; i++) {
			if (num%i==0) {
				res = false;
			}
		}
		System.out.println(res);
		
	}

}
