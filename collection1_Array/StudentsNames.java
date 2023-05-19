package collection1_Array;
import java.util.ArrayList;
public class StudentsNames {
	public static void main(String[] args) {
		ArrayList <String> names = new ArrayList <>();
		names.add("vignesh");
		names.add("gobi");
		names.add("meikumar");
		names.add("prem");
		names.add("ajith");
		
		for(int i =0; i<=names.size()-1; i++) {
			if(names.get(i).contains("a")|| names.get(i).contains("e")||names.get(i).contains("o")||names.get(i).contains("u")) {
				System.out.println(names.get(i));
			}
		}
		System.out.println();
		
		for(String n : names) {
			if(!n.startsWith("a")) {
				System.out.println(n);
			}
		}
		
		names.forEach(a-> {
			if(a.length() > 4) {
				System.out.println(a);
			}
		});
		
		for(int i =0; i<names.size(); i++) {
			
				System.out.println(names.get(i).charAt(names.get(i).length()-1));
				
			}
		}
		
		
		
		
	}


