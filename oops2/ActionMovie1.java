package oops2;

public class ActionMovie1 extends Movie1{
	public String review(int noOfFight) {
	if(noOfFight<0 && noOfFight>=3) {
		return "Bad Movie";
	}
	else if (noOfFight<=3 && noOfFight>=5) {
		return "Average Movie";
		
	}
	else if (noOfFight<=5 && noOfFight>=8) {
		return "Average Movie";
	}
	
	else if (noOfFight>=8) {
		return "Super Action Movie";
	}
	else {
		return "no review";
	}

}
}
