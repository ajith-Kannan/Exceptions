package For1;

public class VowelsCheck {
	public static void main(String[] args) {
		String a = "apple";
		int count =0;
		for (int i=0; i<=a.length()-1; i++) {
			if (a.charAt(i)=='a'||a.charAt(i)=='e'||a.charAt(i)=='i'||a.charAt(i)=='o'||a.charAt(i)=='u'){
				count = count+1;
			}
			}
		System.out.println(count);
		}
	}

