package java8Class;

public interface Bank {
	
	public default int intrest () {
		return 10;
	}
	
	public static int loanAmount() {
		return 50000;
	}
	
	public void bankName();

}
