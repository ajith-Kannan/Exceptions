package collection2_Hashmap;
import java.util.HashMap;
public class LmsTest {
	public static void main(String[] args) {
		HashMap <Integer,String> lms = new HashMap<>();
		lms.put(570, "Nisha");
		lms.put(1142, "Ajith");
		lms.put(1150, "Kumar");
		lms.put(1146, "Prem");
		lms.put(839, "Nisha");
		
		for(Integer id : lms.keySet()) {
			System.out.println(id);
		}
		for(String name : lms.values()) {
			System.out.println(name);
		}
		for(Integer all : lms.keySet()) {
			System.out.println(all+ " "+lms.get(all));
		}
		
		lms.forEach((x,y)-> System.out.println(x+" "+y));
		lms.keySet().forEach(a-> System.out.println(a));
		lms.values().forEach(b-> System.out.println(b));
		
		for(Integer aa : lms.keySet()) {
			if(aa%2 !=0) {
				System.out.println(aa);
				
			}
		}
		for(Integer bb : lms.keySet()) {
			if(lms.get(bb).contains("a") || lms.get(bb).contains("e")||lms.get(bb).contains("i")||lms.get(bb).contains("o")|| lms.get(bb).contains("u")) {
				System.out.println("Vowels Present");
			}
			else {
				System.out.println("not present");
			}
		}
		
		lms.values().forEach(cc-> System.out.println(cc.charAt(cc.length()-1)));
	}

}
