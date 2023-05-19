package oops2;

public class UseSportsBike {
	public static void main(String[] args) {
	
	SportsBike sb = new SportsBike("RE",1800000,"HIMALAYAN","GREEN");
	System.out.println(sb);
	int a = sb.findNetPrice(10);
	int b = sb.findMilage("petrol");
	String c = sb.findGrip("sand");
	
	System.out.println(a+","+b+" ,"+c);
	

	

 }
}