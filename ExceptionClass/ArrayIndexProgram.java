package ExceptionClass;

public class ArrayIndexProgram {
	public static void main(String[] args) {
		System.out.println("START");
		try {
    	int [] aa = {12,45,67,83,66};
		
		System.out.println(aa[8]);
		
		String [] ee = {"ghgh","hfh","hfh"};
		System.out.println(ee[7]);
		}
		catch(ArrayIndexOutOfBoundsException d) {
			//System.err.println("Error Occurs");
			d.printStackTrace();
		}
		
		System.out.println("END");
		
		
	}

}
