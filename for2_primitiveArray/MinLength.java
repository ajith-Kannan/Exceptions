package for2_primitiveArray;

public class MinLength {

		public static void main(String[] args) {
			String [] names = {"prem","Ajith","maikumar","vignesh"};
			String min = names[0];
			
			for(int i=0; i<=names.length-1; i++) {
				if(names[i].length()<= min.length());
				min=names[i];
				
			}
			System.out.println(min);
			
			
			
		}

	}



