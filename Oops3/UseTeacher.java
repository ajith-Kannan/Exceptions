package Oops3;

public class UseTeacher {
	public static void main(String[] args) {
		MathsTeacher m = new MathsTeacher();
		
		m.name = "mrs.Malar George";
		m.age = 24;
		m.location = "Chennai";
		m.qualification = "BE.,";
		m.experiance = 5;
		
		System.out.println(m.name+" "+m.qualification +" "+m.age+" "+m.location+" "+m.findExperiance()+" "+m.findGender()+" "+m.findLocation());
	}

}















































