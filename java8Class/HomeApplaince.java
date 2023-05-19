package java8Class;

public class HomeApplaince implements SmartAppliances{
	
	public void applianceType(String applianceName) {
		if(applianceName.equals("Computer")) {
			System.out.println("Office Use");
		}
		else if(applianceName.equals("tv") || applianceName.equals("Speaker")) {
			System.out.println("Home Use");
		}
		
		else {
			System.out.println("Other");
		}
	}
	
	public String outPutType(String outPut) {
		return "The outPut  "+ outPut;
	}

}
