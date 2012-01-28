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
					if (Items.items[1].getCost() > player.getGold()) {
						output = "You don't own that!";
					} else {
						output = Items.items[i].pickUp();
					}
				}
			}
		} else if (input[0].equals("")) {
			output = "";
		} else if (input[0].equals("go") || input[0].equals("move")) {

			if (input[1].equals("north") && player.currentLoc.north != null)
				player.switchLoc(player.currentLoc.north);

			else if (input[1].equals("south") && player.currentLoc.south != null)
				player.switchLoc(player.currentLoc.south);

			else if (input[1].equals("west") && player.currentLoc.west != null)
				player.switchLoc(player.currentLoc.west);

			else if (input[1].equals("east") && player.currentLoc.east != null) player
					.switchLoc(player.currentLoc.east);
		} else {
			System.out.println(input[0]);
			output = notfoundoutputs();
		}
		System.out.println(output);
	}

	private String notfoundoutputs() {
		String[] randomoutputs = { "What?", "What did you say?",
				"I don't know that command.", "ENGLISH, MOTHERFUCKER, DO YOU SPEAK IT?" };
		return randomoutputs[rand.nextInt(4) - 1];
	}

	private Random rand = new Random();
	private Player player;
	private String output;
	private Items Items = new Items();
}
