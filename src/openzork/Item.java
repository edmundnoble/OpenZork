package openzork;

public class Item {

	public Item(String name, int id) {
		this.name = name;
		this.id = id;
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

	private int id;
	private String name;
	private boolean pickedUp = false;

}
