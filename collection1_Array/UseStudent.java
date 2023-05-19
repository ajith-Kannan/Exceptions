package collection1_Array;

import java.util.ArrayList;

public class UseStudent {
	public static void main(String[] args) {

		Student s1 = new Student("Ajith", 1142, 6, "kannan", 87);
		Student s2 = new Student("krish", 334, 4, "gokul", 75);
		Student s3 = new Student("gobi", 2267, 5, "Steve", 43);
		Student s4 = new Student("kumar", 5544, 9, "Gopal", 65);
		Student s5 = new Student("ram", 3355, 6, "Sekar", 79);

		ArrayList<Student> st = new ArrayList<>();
		st.add(s1);
		st.add(s2);
		st.add(s3);
		st.add(s4);
		st.add(s5);

		for (int i = 0; i <= st.size() - 1; i++) {
			System.out.println(st.get(i));

		}
		for (Student s : st) {
			System.out.println(s);

		}

		st.forEach(a -> System.out.println(a));
		
		for(int i=0; i<=st.size()-1; i++) {
			if(st.get(i).getAverage()>75 && st.get(i).getSection()==9) {
				System.out.println(st.get(i));
			}
		}
		
		int temp = st.get(0).getrollNumber();
		String temp1 = "";
		for(Student ee :st) {
			if(ee.getrollNumber()>temp) {
				temp = ee.getrollNumber();
				temp1 = ee.getName();
			}
			
		}
		System.out.println(temp1);
		
		st.forEach(ss-> {
			if(ss.getAverage()<75) {
				System.out.println(ss.getName().concat(ss.getFatherName()));
			}
		});
		 
		String val ="";
		 
		for(Student x : st) {
			if(x.getFatherName().contains("a")|| x.getFatherName().contains("e")||x.getFatherName().contains("i")||x.getFatherName().contains("o")||x.getFatherName().contains("u")) {
			val = "Vowels present";
			}
			else {
				val = "Vowels not present";
				
			}
		}
		System.out.println(val);
		Student min = st.get(0);
		
		for(int i=0; i<=st.size()-1; i++) {
			if(st.get(i).getName().length() < min.getName().length()) {
				min=st.get(i);
				
			}
		}
		System.out.println(min);
		
		ArrayList<Student>nameList = new ArrayList<>();
		for(Student xx : st) {
			if(xx.getName().endsWith("m")) {
				nameList.add(xx);
				
			}
		}
		nameList.forEach(xx->System.out.println(xx));
		
		

	}

}
