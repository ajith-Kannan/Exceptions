package functions;

public class Student1 {
	int tamil;
	int english;
	int maths;
	int science;
	int social;
	
	public void findTotal() {
		int total = tamil+english+maths+science+social;
		System.out.println(total);
	}
	
	public void markDetails() {
		System.out.println("Tamil="+tamil+" "+"English="+english+" "+"Maths="+maths+" "+"Science="+science+"Social="+social);
		
	}

}
