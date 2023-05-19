package conditons;

public class StudentAge {
	public static void main(String[] args) {
		int std1 = 19;
		int std2 =18;
		int std3 = 20;
		int std4 = 23;
		
		if (std1<std2 && std1 < std3&& std1< std4) {
			System.out.println(std1+"is young");
		}
		else if (std2 < std1 && std2 < std3 && std2 < std4) {
			System.out.println(std2+" is young");
		}
		else if (std3 < std1 && std3 < std2 && std3 < std4) {
			System.out.println(std3+" is young");
			
		}
		else if (std4 < std1 && std4 < std2 && std4 < std3) {
			System.out.println(std4+" is young");
		}
		else {
			System.out.println("wrong input");
		}
	}

}
