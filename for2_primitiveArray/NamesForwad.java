package for2_primitiveArray;

public class NamesForwad {
	public static void main(String[] args) {
		String [] names = new String [6];
		names[0]="Prem";
		names[1]="maikumar";
		names[2]="Ajith";
		names[3]="Gobi";
		names[4]="pradeep";
		names[5]="vignesh";
		
		for(int i=0; i<=names.length-1; i++) {
			System.out.println(names[i]);
		}
		for (int i=names.length-1; i>=0; i--) {
			System.out.println(names[i]);
		}
	}

}
