package collection1_Array;

public class Student {
	private String name;
	private int rollNumber;
	private int section;
	private String fatherName;
	private int average;
	
	
	public void setName(String a) {
		name=a;
	}
	public String getName() {
		return name;
	}
	
	public void setRollNumber(int b) {
		rollNumber = b;
	}
	public int getrollNumber() {
		return rollNumber;
		
	}

	public void setSection(int c) {
		section = c;
		
	}
	public int getSection() {
		return section;
	}
	public void setFatherName(String d) {
		fatherName=d;
	}
	public String getFatherName() {
		return fatherName;
	}
	public void setAverage (int e) {
		average = e;
	}
	public int getAverage() {
		return average;
	
	}
	
	public Student (String nm,int rn,int st,String fn,int ag) {
		name = nm;
		rollNumber=rn;
		section=st;
		fatherName=fn;
		average=ag;

	}
	
	public String toString() {
		return name+" "+rollNumber+" "+section+" "+fatherName+" "+average+"\n";
	}
}
