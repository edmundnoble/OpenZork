package openzork;

import java.util.ArrayList;
import java.util.HashMap;

public class Location {

	class CommandHandler {
		public void run(Player p, String args) {}
	}
	public String getName() {
		return name;
	}

	public String getDescription() {
		return description;
	}

	public String getNameAndDesc() {
		return (name + " \n" + description + "\n");
	}

	public ArrayList<Item> getItems() {
		return itemsInArea;
	}/*
	 * public Location(String name, String description, boolean north, boolean
	 * south, boolean east, boolean west) { this.north = north; this.south =
	 * south; this.west = west; this.east = east; Name = name; Description =
	 * description; }
	 */

	public Location() {
		name = "";
		description = "";
		itemsInArea = null;
		commandMap.put("look", new CommandHandler() {
			public void run(Player p, String args) {
				System.out.println(p.currentLoc.description);
			}
		});
		CommandHandler takeHandler = new CommandHandler() {
			public void run(Player p, String args) {
				
			}
		};
		commandMap.put("take", takeHandler);
		commandMap.put("grab", takeHandler);
	}
	
	public void addCommand(String command, CommandHandler handler) {
		commandMap.put(command, handler);
	}
	
	public boolean parse(String command, Player p) {
		if (command.isEmpty() || commandMap.get(command.split(" ")[0]) == null) return false;
		commandMap.get(command.split(" ")[0]).run(p, command); return true;
	}
	
	protected HashMap<String, CommandHandler> commandMap = new HashMap<String, CommandHandler>();
	protected String description;
	protected String name;
	protected ArrayList<Item> itemsInArea;
	Location north, south, east, west;
}
