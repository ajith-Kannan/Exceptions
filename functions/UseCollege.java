package functions;

public class UseCollege {
		public static void main(String[] args) {
			Collage c1 = new Collage();
			c1.name = "Anna University";
			c1.fees =400000;
			c1.grade = "1st gread";
			c1.location = "";

			Collage c2 = new Collage();
			c2.name = "Bharathidasan University";
			c2.fees = 800000;
			c2.grade = "1st gread";
			c2.location = "trichy";

			Collage c3 = new Collage();
			c3.name = "Annamalai University";
			c3.fees = 900000;
			c3.grade = "1st gread";
			c3.location = "thanjavur";

			Collage c4 = new Collage();
			c4.name = "pachayappas";
			c4.fees = 800000;
			c4.grade = "1st gread";
			c4.location = "Chennai";

			Collage c = c1.minCollageFees(c1, c2, c3, c4);
			Collage[] collages = new Collage[5];
			collages[0] = c1;
			collages[1] = c2;
			collages[2] = c3;
			collages[3] = c4;

			for (Collage x : collages) {
			}
			System.out.println(c.name + " " + c.fees + " " + c.location + " " + c.grade);
		}

	}


