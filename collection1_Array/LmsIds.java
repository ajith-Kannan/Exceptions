package collection1_Array;

import java.util.ArrayList;
public class LmsIds {
	public static void main(String[] args) {
		ArrayList <Integer> lms = new ArrayList<>();
		lms.add(571);
		lms.add(580);
		lms.add(598);
		lms.add(456);
//		lms.set(3, 590);
//		lms.remove(2);
//		
		for(int i=0; i<lms.size(); i++) {
			System.out.println(lms.get(i));
		}
		System.out.println();
		for(int i=lms.size()-1; i>=0; i--) {
			System.out.println(lms.get(i));
		}
		System.out.println();
		for(Integer a : lms) {
			System.out.println(a);
		}
		System.out.println();
		lms.forEach(s->System.out.println(s));
		System.out.println();
		
		lms.forEach(e-> {
			if(e%2==0) {
				System.out.println(e);
			}
		});
	
	}

	
		
	}


