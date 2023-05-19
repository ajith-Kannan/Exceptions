package oops2;

public class UseAxisLoan {
	public static void main(String[] args) {
		AxisBank a  = new AxisBank();
		int as = a.loan();
		int as1 = a.loan(40000);
		int as2 = a.loan(500000,40000);
		System.out.println(as+","+as1+","+as2);
		
		System.out.println(a.loan()+", "+a.loan(40000)+", "+a.loan(50000, 40000));
	}

}
