package openzork;

public class Item {

	public Item(String name) {
		this.name = name;
	}

	public boolean isPickedUp() {
		return pickedUp;
	}

	private int id;
	private String name;
	private boolean pickedUp = false;

}
