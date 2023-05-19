package java8Class;

public interface Electronics {
	
	public static String onOff(boolean isOn) {
		if(isOn == true) {
			return "it is Working";
		}
		else {
			return "it is not Working";
					
		}
	}
	
	public void printClass();

}
