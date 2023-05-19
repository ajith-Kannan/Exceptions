package functions;

public class UseStudent {
	public static void main(String[] args) {
		Student s1 = new Student();

		s1.tamil = 98;
		s1.english = 37;
		s1.maths = 35;
		s1.science = 92;
		s1.social = 87;
		System.out.println(s1.average(s1.tamil, s1.english, s1.maths, s1.science, s1.social));

		Student s2 = new Student();

		s2.tamil = 78;
		s2.english = 67;
		s2.maths = 87;
		s2.science = 100;
		s2.social = 87;
		System.out.println(s2.average(s2.tamil, s2.english, s2.maths, s2.science, s2.social));

		Student s3 = new Student();

		s3.tamil = 80;
		s3.english = 67;
		s3.maths = 97;
		s3.science = 50;
		s3.social = 87;
		System.out.println(s3.average(s3.tamil, s3.english, s3.maths, s3.science, s3.social));
	}

}
