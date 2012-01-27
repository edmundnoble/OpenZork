package openzork;

class Player {

	public Player() {

	}

	public Location getCurrent() {
		return currentLoc;
	}

	public void switchLoc(Location newLoc) {
		currentLoc = newLoc;
		System.out.print(newLoc.getNameAndDesc());
	}

	public Location currentLoc;
}
