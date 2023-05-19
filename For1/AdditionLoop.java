package For1;

public class AdditionLoop {
	public static void main(String[] args) {
//		int temp = 0;
//		for (int i = 1; i<=5; i++) {
//			temp = temp+i;
//			
//		
//		}
//		System.out.println(temp);
		
		String a = "a+2a+3";
		String [] a1 = a.split("a");
		int total = Integer.parseInt(a1[1])+Integer.parseInt(a1[3]);
		System.out.println(total);
	}

}
