package oops2;

public class AxisBank {
	
	public int loan() {
		return 30000;	
	}
	
	public int loan(int salary) {
		return salary*10+30000;
	}
	
	public int loan(int landValue,int salary) {
		return (landValue*25/100)+(salary*10)+30000;
	}

}
