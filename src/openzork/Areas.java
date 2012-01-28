package openzork;

public class Areas {

	public Areas() {
		OneArea = new OneArea();
		OneAreaN = new OneAreaN();
		OneAreaS = new OneAreaS();
		OneAreaBar = new OneAreaBar();
		OneAreaShop = new OneAreaShop();
		DefLoc = new Location();
	}

	public final class OneArea extends Location {

		public OneArea() {
			super();
			Name = "Field";
			Description = "You are in a field. Exits are: North and south.";
			north = OneAreaN;
			south = OneAreaS;
			east = DefLoc;
			west = DefLoc;
		}

	}

	public final class OneAreaN extends Location {

		public OneAreaN() {
			super();
			Name = "Forest";
			Description = "You are in a forest. You see a pile of leaves.";
			south = OneArea;
			north = DefLoc;
			east = DefLoc;
			west = DefLoc;
		}

	}

	public final class OneAreaS extends Location {

		public OneAreaS() {
			super();
			Name = "Village";
			Description = "You find yourself in a village. Exits are: North, East (bar), and West (shop).";
			north = OneArea;
			east = OneAreaBar;
			west = OneAreaShop;
			south = DefLoc;
		}

	}

	public final class OneAreaBar extends Location {

		public OneAreaBar() {
			super();
			Name = "Bar";
			Description = "";
			north = DefLoc;
			east = DefLoc;
			west = DefLoc;
			south = DefLoc;
		}

	}

	public final class OneAreaShop extends Location {

		public OneAreaShop() {
			super();
			Name = "Shop";
			Description = "";
			north = DefLoc;
			east = DefLoc;
			west = DefLoc;
			south = DefLoc;
		}
	}

	public static Location DefLoc;
	public static Location OneArea;
	public static Location OneAreaN;
	public static Location OneAreaS;
	public static Location OneAreaBar;
	public static Location OneAreaShop;

}
