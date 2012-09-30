package openzork;

import java.util.Scanner;

final class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Areas.initLocations();
		try {
			Player player = new Player();
			// openzork.Location StartLocation = new Location("Field",
			// "You are in a field. Possible exits are: North and south.",
			// true, true, false, false);
			Location startingarea = Areas.OneArea;
			player.switchLoc(startingarea);
			while (true) {
				player.currentLoc.parse(scanner.nextLine(), player);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	static Scanner scanner = new Scanner(System.in);
	// Location startingarea = new areas.StartingArea();
}
