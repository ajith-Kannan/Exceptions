package ExceptionClass;

public class MultiCatchProgram {
	public static void main(String[] args) {
		System.out.println("START");
		
		try {
			String [] a = {"Sun","Moon","Star"};
			
			System.out.println(a[1].toUpperCase());
			System.out.println(Integer.parseInt(a[2]));
		}
		catch(ArrayIndexOutOfBoundsException a) {
			a.printStackTrace();
		}
		catch(IndexOutOfBoundsException b) {
			b.printStackTrace();
		}
		catch(RuntimeException c) {
			c.printStackTrace();
			
		}
		catch(Exception d) {
			d.printStackTrace();
		}
		
		System.out.println("END");
	}

}
