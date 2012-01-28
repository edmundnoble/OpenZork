package openzork;

public class Areas {

	public Areas() {
		OneArea = new OneArea();
		OneAreaN = new OneAreaN();
		OneAreaS = new OneAreaS();
		OneAreaBar = new OneAreaBar();
		OneAreaShop = new OneAreaShop();
	}

	public final class OneArea extends Location {

		public OneArea() {
			super();
			Name = "Field";
			Description = "You are in a field. Exits are: North and south.";
			north = OneAreaN;
			south = OneAreaS;
		}

	}

	public final class OneAreaN extends Location {

		public OneAreaN() {
			super();
			Name = "Forest";
			Description = "";
			south = OneArea;
			items[1] = new Item("Leaves", 1, OneAreaN);
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
		}

	}

	public final class OneAreaBar extends Location {

		public OneAreaBar() {
			super();
			Name = "Bar";
			Description = "";
			north = null;
			south = null;
			west = null;
			east = null;
		}

	}

	public final class OneAreaShop extends Location {

		public OneAreaShop() {
			super();
			Name = "Shop";
			Description = "";
			north = null;
			south = null;
			west = null;
			east = null;
		}

	}

	public Location OneArea;
	public Location OneAreaN;
	public Location OneAreaS;
	public Location OneAreaBar;
	public Location OneAreaShop;
}
