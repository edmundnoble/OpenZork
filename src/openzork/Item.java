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

	public String pickUp() {
		pickedUp = true;
		return "You pick up the " + name;
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

	public String buy(Player player) {
		String retval = "";
		if (player.getGold() > cost) {
			player.addGold(-cost);
			pickUp();
		} else {
			retval = "You don't have enough gold!";
		}
		return retval;
	}

	private int cost = 0;
	private int id;
	private String name;
	private boolean pickedUp = false;
	private Location loc;

}
