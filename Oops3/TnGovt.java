package Oops3;

public class TnGovt implements CentralGovt {
	String jointType;
	String materialType;
	String fontName;

	public String joint() {
		return jointType;
	}
	public String material() {
		return materialType;
	}
	public String font() {
		return fontName;
	}
	
	public void color() {
		System.out.println("YELLOW");
	}
	
	public void FixingArea() {
		System.out.println("Centre");
	}

}
