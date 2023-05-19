package functions;

public class Collage {
		String name;
		int fees;
		String grade;
		String location;

		public Collage minCollageFees(Collage a, Collage b, Collage c, Collage d) {
			if (a.fees < b.fees && a.fees < c.fees && a.fees < d.fees) {
				return a;
			} else if (b.fees < a.fees && b.fees < c.fees && b.fees < d.fees) {
				return b;
			} else if (c.fees < a.fees && c.fees < b.fees && c.fees < d.fees) {
				return c;
			} else if (d.fees < a.fees && d.fees < b.fees && d.fees < c.fees) {
				return d;
			} else {
				return d;
			}
		}
	}


