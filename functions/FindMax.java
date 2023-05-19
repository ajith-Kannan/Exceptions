package functions;

public class FindMax {
	public int findMax(int[]a) {
		int max = a[0];
		for(int i=0; i<=a.length-1; i++) {
			if(a[i]>=max) {
				max=a[i];
			}
			
		}	
		return max;
	}
	int count=0;
	public int FindCount(int[]a) {
		for(int i=0; i<=a.length-1; i++) {
			if(a[i]>=2) {
				count=count+1;
			}
			
		}
		return count;
		
	}

}
