package for2_primitiveArray;

public class MaxLengthWord {
	public static void main(String[] args) {
		String [] names = {"prem","Ajith","maikumar","vignesh"};
		String max = names[0];
		
		for(int i=0; i<=names.length-1; i++) {
			if(names[i].length()>=max.length());
			max=names[i];
			
		}
		System.out.println(max);
		
		
		
	}

}
