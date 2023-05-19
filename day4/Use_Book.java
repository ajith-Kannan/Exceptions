package day4;

public class Use_Book {
	public static void main( String []args) {
		Book book1= new Book();
		String book01 = args[0];
		String []b1= book01.split(",");
		
		
		book1.name=b1[0];
		book1.price=Integer.parseInt(b1[1]);
		book1.numberOfPages=Integer.parseInt(b1[2]);
		book1.isRuled=Boolean.parseBoolean(b1[3]);
		
		Book book2 = new Book();
		String book02= args[1];
		String []b2=book02.split(",");
		
		book2.name=b2[0];
		book2.price=Integer.parseInt(b2[1]);
		book2.numberOfPages=Integer.parseInt(b2[2]);
		book2.isRuled=Boolean.parseBoolean(b2[3]);
		
		Book book3 = new Book();
		String book03=args[2];
		String []b3=book03.split(",");
		
		book3.name=b3[0];
		book3.price=Integer.parseInt(b3[1]);
		book3.numberOfPages=Integer.parseInt(b3[2]);
		book3.isRuled=Boolean.parseBoolean(b3[3]);
		
		System.out.println(book1.name+"\n"+book1.price+"\n"+book1.numberOfPages+"\n"+"\n"+book2.name+"\n"+book2.price+"\n"+book2.numberOfPages+"\n"+book2.isRuled+"\n"+"\n"+book3.name+"\n"+book3.price+"\n"+book3.numberOfPages+"\n"+book3.isRuled);
		
		int totalPrice= book1.price+book2.price+book3.price;
		System.out.println(totalPrice);
				
		
	
		
	
		
		
		
		
		
		
	}

}
