package oops2;

public class Movie1 {
	public String review(int noOfFight) {
		if(noOfFight>3) {
			return "Good Movie";
		}
		else if (noOfFight<0 && noOfFight>=3) {
			return "Bad Movie";
		}
		else {
			return "no review";
		}
		
		
	}

}
