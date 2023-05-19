package oops2;

public class ActionMovie extends Movie {
	public String fightSequnce(int fight) {
		if(fight>=2 && fight<=5) {
			return "low action";
		}
		else if(fight>=5 && fight <=7) {
			return "mid action";
		}
		else if (fight>=7) {
			return "Fully action";
		}
		else {
			return "No fight";
		}
	

}
}
