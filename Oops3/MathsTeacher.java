package Oops3;

public class MathsTeacher implements Teacher {
	String name;
	int age;
	String qualification;
	int experiance;
	String location;

	public String findGender() {
		if (name.startsWith("mr")) {
			return "MALE";
		} else if (name.startsWith("mrs")) {
			return "FEMALE";

		} else {
			return "NOT HUMAN";

		}

	}

	public String findLocation() {
		if (location.equalsIgnoreCase("Chennai")) {
			return "Local";

		} else {
			return "OUTER";
		}

	}

	public String findExperiance() {
		if (experiance > 3) {
			return "EXPERIANCED";
		} else {
			return "NOT EXPERIANCED";

		}
	}

}
