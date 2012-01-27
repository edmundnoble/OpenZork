package openzork;

abstract class Location {

	public String getName() {
		return Name;
	}

	public String getDescription() {
		return Description;
	}

	public String getNameAndDesc() {
		return (Name + "\n\n" + Description + "\n");
	}/*
	 * public Location(String name, String description, boolean north, boolean
	 * south, boolean east, boolean west) { this.north = north; this.south =
	 * south; this.west = west; this.east = east; Name = name; Description =
	 * description; }
	 */

	public Location() {
	}

	protected Item items[] = new Item[5];
	protected String Description;
	protected String Name;
	Location north, south, east, west = null;
}
