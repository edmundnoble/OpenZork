package openzork;

public class Item {

	/*
	 * Creates a new <i>Item</i>.
	 * 
	 * @param name The name of the item.
	 * 
	 * @param id The item ID.
	 * 
	 * @param loc The location of the item.
	 */
	public Item(String name, int id, Location loc) {
		this.name = name;
		this.id = id;
		this.loc = loc;
	}

	public Item(String name, int id, Location loc, int cost) {
		this(name, id, loc);
		this.cost = cost;
	}

	public int getCost() {
		return cost;
	}

	public boolean isPickedUp() {
		return pickedUp;
	}

	public void setIsPickedUp(boolean pickedUp) {
		this.pickedUp = pickedUp;
	}

	public int getID() {
		return id;
	}

	public String getName() {
		return name;
	}

	public Location getLoc() {
		return loc;
	}

	public void setLoc(Location loc) {
		this.loc = loc;
	}

	public String buy(Player player) {
		String retval = "";
		if (player.getGold() > cost) {
			player.addGold(-cost);
			setIsPickedUp(true);
		} else {
			retval = "You don't have enough gold!";
		}
		return retval;
	}

	public boolean isOwned() {
		return owned;
	}

	public void setOwned(boolean owned) {
		this.owned = owned;
	}

	private int cost = 0;
	private int id;
	private String name;
	private boolean owned = true;
	private boolean pickedUp = false;
	private Location loc;

}
