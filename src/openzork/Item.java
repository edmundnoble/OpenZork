package openzork;

public class Item {

	public Item(String name, int id, Location loc) {
		this.name = name;
		this.id = id;
		this.loc = loc;
	}

	public boolean isPickedUp() {
		return pickedUp;
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

	private int id;
	private String name;
	private boolean pickedUp = false;
	private Location loc;

}
