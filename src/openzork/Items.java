package openzork;

public class Items {

	public Items() {
		Item leaves = new Item("leaves", 1, areas.new OneArea());
		Item pen = new Item("pen", 2, areas.new OneArea());
		Item sword = new Item("sword", 3, areas.new OneAreaShop(), 50);
		items[1] = leaves;
		items[2] = pen;
		items[3] = sword;
		System.out.println(items.length);
	}

	public Areas areas = new Areas();
	public Item[] items;

}
