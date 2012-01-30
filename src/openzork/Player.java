package openzork;

class Player {

	public Player() {

	}

	public void addGold(int goldToAdd) {
		gold += goldToAdd;
	}

	public int getGold() {
		return gold;
	}

	public Location getCurrent() {
		return currentLoc;
	}

	public void setCurrent(Location loc) {
		currentLoc = loc;
	}

	public void switchLoc(Location newLoc) {
		currentLoc = newLoc;
		System.out.println(newLoc.getNameAndDesc());
	}

	private int gold = 0;
	public Location currentLoc;
}
