package openzork;

final class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			Player player = new openzork.Player();
			Areas areas = new Areas();
			// openzork.Location StartLocation = new Location("Field",
			// "You are in a field. Possible exits are: North and south.",
			// true, true, false, false);

			Location startingarea = areas.new OneArea();
			player.switchLoc(startingarea);
			while (true) {
				Parser parser = new Parser(player.currentLoc, player);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	// Location startingarea = new areas.StartingArea();
}
