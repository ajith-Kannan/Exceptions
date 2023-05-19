package ExceptionClass;

public class UseLogin {
	public static void main(String[] args) throws PasswordException{
		
		Login l = new Login();
		
		l.checkPassword("hhhhhhhhh");
	}

}
