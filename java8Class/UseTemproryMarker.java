package java8Class;

public class UseTemproryMarker {
	public static void main(String[] args) {
		
		TemproryMarker t1 = new TemproryMarker();
		Marker.markerType("cameal");
		
		System.out.println(t1.markerPrice(45));
	}

}
