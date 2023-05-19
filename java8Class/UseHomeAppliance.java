package java8Class;

public class UseHomeAppliance {
	public static void main(String[] args) {
		
		HomeApplaince  h  = new HomeApplaince();
		
		SmartAppliances.OpreatingSystem();
		h.applianceType("Speaker");
		System.out.println(h.outPutType("Speaker"));
	}

}
