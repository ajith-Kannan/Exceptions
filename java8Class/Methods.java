package java8Class;

public class Methods  {
	
		
		public  static int find1(int[]a) {
			int max = a[0];
			
			for(int i : a) {
				if(i>max) {
					max=i;
				}
				
			}
			return max;
			
		}
		
		public  int find(int[]b) {
			int min  = b[0];
			for(int i : b) {
				if(i<min) {
				min=i;
			}
				
			
		}
			return min;
		
	
	


}
}
