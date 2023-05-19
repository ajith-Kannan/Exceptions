package java8Class;

public interface SmartAppliances {
	
	
	public static void OpreatingSystem() {
		System.out.println("android");
	}
	
	public default String outPutType(String output) {
		return "The output is "+output;
	}
	
	public void applianceType(String applianceName);

}
