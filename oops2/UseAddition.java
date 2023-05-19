package oops2;

public class UseAddition {
	public static void main(String[] args) {
		Addition a = new Addition();
		int ar = a.add(15, 45);
		int ar1 = a.add(12, 40, 50);
		int ar2 = a.add("mark", "anthoy");
		
		System.out.println(ar+" "+ar1+" "+ar2);
		
		
	}

}
