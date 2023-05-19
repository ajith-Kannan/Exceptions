package functions;

public class Add {
	
	public int add(int[]a) {
		int temp = 0;
		for(int i=0; i<=a.length-1; i++) {
			temp=temp+a[i];
			
		}
		return temp;
		
	}

}
