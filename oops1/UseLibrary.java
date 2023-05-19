package oops1;

public class UseLibrary {
	public static void main(String[] args) {
		 Book b1 = new Book();
		 b1.bookName = "Thirukural";
		 b1.authorName = "Thiruvalluvar";
		 b1.price = 500;
		 b1.noOfPages = 100;
		 b1.publishmentYear = 2000;
		 
		 Library l1 = new Library();
		 l1.name = "Public library";
		 l1.centreCode = 208;
		 l1.type = "Public";
		 l1.book = b1;
		 
		 System.out.println(l1.name+", "+l1.centreCode+" "+l1.book.authorName+", "+l1.book.publishmentYear);
		 
		 
	}

}
