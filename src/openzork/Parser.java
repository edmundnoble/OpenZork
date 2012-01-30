package openzork;

import java.util.Random;

class Parser {

	public Parser(Player player) {
		output = "";
		this.player = player;
	}

	public void parse(String Input) {
		Input = Input.replace("\n", "");
		Input = Input.trim();
		String input[] = Input.split(" ");

		if (input[0].equalsIgnoreCase("look")) {
			output = player.currentLoc.getDescription() + "\n";

			for (int i = 0; i < Items.items.length; i++) {

				if (Items.items[i].getLoc() == player.getCurrent()
						&& !Items.items[i].isPickedUp()) output += " \nThere is a "
						+ Items.items[i].getName() + " on the ground.";
			}

		} else if (input[0].equalsIgnoreCase("inv")
				|| input[0].equalsIgnoreCase("inventory")) {
			output = "Inventory:";

			for (int i = 0; i < Items.items.length; i++) {

				if (Items.items[i].isPickedUp()) {
					output += "\n" + Items.items[i].getName();
				}
			}

		} else if (input[0].equalsIgnoreCase("drop")) {
			temp = 0;

			for (int i = 0; i < Items.items.length; i++) {

				if (input[1].equalsIgnoreCase(Items.items[i].getName())) {
					Items.items[i].setIsPickedUp(false);
					Items.items[i].setLoc(player.currentLoc);
					output = "You drop the " + Items.items[i].getName() + ".";

				} else
					temp++;
			}

			if (temp == Items.items.length) {
				output = "You don't have a " + input[1] + ".";
			}

		} else if (input[0].equalsIgnoreCase("get") || input[0].equalsIgnoreCase("take")) {
			System.out.println(Items.items.length);
			temp = 0;

			for (int i = 0; i < Items.items.length; i++) {

				if (Items.items[i].getName().equalsIgnoreCase(input[1])
						&& Items.items[i].getLoc().equals(player.currentLoc)) {

					if (Items.items[i].isPickedUp())

						output = "You already have a " + Items.items[i].getName() + "!";

					else if (Items.items[i].getCost() > 0 && !Items.items[i].isOwned())

						output = "You don't own that!";

					else {
						Items.items[i].setIsPickedUp(true);
						output = "You take the " + Items.items[i].getName();
					}

				} else {
					temp++;
				}
			}

			if (temp == Items.items.length) {
				output = "There is no " + input[1] + " here.";
			}

		} else if (input[0].equalsIgnoreCase("purchase")
				|| input[0].equalsIgnoreCase("buy")) {

			for (int i = 0; i < Items.items.length; i++) {

				if (Items.items[i].getName().equalsIgnoreCase(input[1])) {
					Items.items[i].buy(player);
				}
			}

		} else if (input[0].equalsIgnoreCase("")) {
			output = "";

		} else if (input[0].equalsIgnoreCase("go") || input[0].equalsIgnoreCase("move")) {

			if (input[1].equalsIgnoreCase("")) output = "Where?";

			if (input[1].equalsIgnoreCase("north"))

				if (!player.currentLoc.north.getName().equalsIgnoreCase("")) {
					player.switchLoc(player.currentLoc.north);
					System.out.println(player.currentLoc.getName() + "l");

				} else {
					output = "You can't go that way.";
				}

			else if (input[1].equalsIgnoreCase("south"))

				if (!player.currentLoc.south.getName().equalsIgnoreCase("")) {
					player.switchLoc(player.currentLoc.south);
					System.out.println(player.currentLoc.getName() + "l");
				} else {
					output = "You can't go that way.";

				}
			else if (input[1].equalsIgnoreCase("west"))

				if (!player.currentLoc.west.getName().equalsIgnoreCase("")) {
					player.switchLoc(player.currentLoc.west);
					System.out.println(player.currentLoc.getName() + "l");
				}

				else {
					output = "You can't go that way.";
				}

			else if (input[1].equalsIgnoreCase("east"))

				if (!player.currentLoc.east.getName().equalsIgnoreCase("")) {
					player.switchLoc(player.currentLoc.east);
					System.out.println(player.currentLoc.getName() + "l");

				} else {
					output = "You can't go that way.";

				}
			else {
				output = "You can't go that way.";
			}

		} else if (input[0].equalsIgnoreCase("exit")) {
			System.exit(0);

		} else {
			output = notfoundoutputs();
		}
		output = output.replace("\n", "");
		System.out.println("\n" + output + "\n ");
	}

	private String notfoundoutputs() {
		String[] randomoutputs = { "What?", "What did you say?",
				"I don't know that command.", "ENGLISH, MOTHERFUCKER, DO YOU SPEAK IT?" };
		return randomoutputs[rand.nextInt(4)];
	}

	private int temp = 0;
	private Random rand = new Random();
	private Player player;
	private String output = "lolnowork";
	private Items Items = new Items();
}
