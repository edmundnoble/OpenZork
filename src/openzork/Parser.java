package openzork;

import java.util.Random;

class Parser {

	public Parser(Player player) {
		output = "/n";
		this.player = player;
	}

	public void parse(String Input) {
		String input[] = Input.split(" ");

		if (input[0].equals("look")) {
			output = player.currentLoc.getNameAndDesc();

		} else if (input[0].equals("get") || input[0].equals("take")) {
			System.out.println(Items.items.length);
			for (int i = 0; i > Items.items.length; i++) {

				if (Items.items[i].getName() == input[1]) {

					if (Items.items[1].getCost() > 0) {

						output = "You don't own that!";
					} else {

						output = Items.items[i].pickUp();
					}

				} else {

					temp++;
				}
			}
			if (temp == Items.items.length) {
				output = "There is no " + input[1] + " here.";
			}
		} else if (input[0].equals("purchase") || input[0].equals("buy")) {
			for (int i = 0; i > Items.items.length; i++) {
				if (Items.items[i].getName() == input[1]) {
					Items.items[i].buy(player);
				}
			}

		} else if (input[0].equals("")) {
			output = "";
		} else if (input[0].equals("go") || input[0].equals("move")) {

			if (input[1].equals("north") && !player.currentLoc.north.getName().equals(""))
				player.switchLoc(player.currentLoc.north);

			else if (input[1].equals("south")
					&& !player.currentLoc.south.getName().equals(""))
				player.switchLoc(player.currentLoc.south);

			else if (input[1].equals("west")
					&& !player.currentLoc.west.getName().equals(""))
				player.switchLoc(player.currentLoc.west);

			else if (input[1].equals("east")
					&& !player.currentLoc.east.getName().equals(""))
				player.switchLoc(player.currentLoc.east);
			else {
				output = "You can't go that way.";
			}
		} else {
			output = notfoundoutputs();
		}
		System.out.println("\n" + output + "\n");
	}

	private String notfoundoutputs() {
		String[] randomoutputs = { "What?", "What did you say?",
				"I don't know that command.", "ENGLISH, MOTHERFUCKER, DO YOU SPEAK IT?" };
		return randomoutputs[rand.nextInt(4) - 1];
	}

	private int temp = 0;
	private Random rand = new Random();
	private Player player;
	private String output;
	private Items Items = new Items();
}
