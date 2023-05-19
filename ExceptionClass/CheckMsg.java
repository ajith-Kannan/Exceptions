package ExceptionClass;
import java.io.File;
import java.io.FileReader;
public class CheckMsg {
	public static void main(String[] args) throws Exception{
		
		File f = new File("C:\\Users\\ajith\\OneDrive\\Documents\\Good Moring.txt");
		
		FileReader fr = new FileReader(f);
		int temp = 0;
		while((temp = fr.read())!=-1) {
			System.out.print((char)(temp));
		}
	}

}
