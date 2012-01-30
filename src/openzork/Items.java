package openzork;

public class Items {

	public Items() {

		items[0] = new Item("leaves", 1, Areas.OneAreaN);
		items[1] = new Item("pen", 2, Areas.OneArea);
		items[2] = new Item("sword", 3, Areas.OneAreaShop, 50);

	}

	public Item[] items = new Item[3];

}
