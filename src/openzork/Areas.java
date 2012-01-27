package openzork;

public class Areas {

	public Areas() {
		OneArea = new OneArea();
		OneAreaN = new OneAreaN();
		OneAreaS = new OneAreaS();
	}

	public final class OneArea extends Location {

		public OneArea() {
			super();
			Name = "Field";
			Description = "You are in a field. Possible exits are: North and south.";
			north = OneAreaN;
			south = OneAreaS;
			east = null;
			west = null;
		}
	}

	public final class OneAreaN extends Location {

		public OneAreaN() {
			super();
			Name = "Forest";
			Description = "";
			south = OneArea;
			north = null;
		}
	}

	public final class OneAreaS extends Location {

	}

	public Location OneArea;
	public Location OneAreaN;
	public Location OneAreaS;
}
