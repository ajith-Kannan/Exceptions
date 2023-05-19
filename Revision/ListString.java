package Revision;

import java.util.List;
import java.util.ArrayList;
public class ListString {
	
	public List<String> AddString(List<String>words) {
		ArrayList <String> ww = new ArrayList<>();
		
		words.forEach(x->{
			if(x.contains("a") || x.contains("e") || x.contains("i")|| x.contains("o") || x.contains("u")) {
		
			return;
			}
			else {
				ww.add(x);
				
			}
		});
		
		return ww;
		
		
		
	}

}
