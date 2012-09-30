package openzork;

import java.util.ArrayList;

class Player {

	public Player() {

	}
	
	public ArrayList<Item> getItems() {
		return inventory;
	}
	
	public void addItem(Item item) {
		inventory.add(item);
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
	
	private ArrayList<Item> inventory;
	private int gold = 0;
	public Location currentLoc;
}
