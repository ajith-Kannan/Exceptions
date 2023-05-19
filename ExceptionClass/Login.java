package ExceptionClass;



public class Login  {
	

	
	public void checkPassword(String password) throws PasswordException{
		
		if(password.length()<8) {
			throw new PasswordException("Password must contain more the 8 letters");
		}
		else {
			System.out.println("Login Sccessfully");
		}
		
	}

}
