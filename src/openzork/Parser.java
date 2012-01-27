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

		} else if (input[0].equals("")) {

		} else if (input[0].equals("go") || input[0].equals("move")) {
			player.switchLoc(player.currentLoc.north);
		} else {
			System.out.println(input[0]);
			output = notfoundoutputs();
		}
		System.out.println(output);
	}

	private String notfoundoutputs() {
		String[] randomoutputs = { "What?", "What did you say?",
				"I don't know that command.",
				"ENGLISH, MOTHERFUCKER, DO YOU SPEAK IT?" };
		return randomoutputs[rand.nextInt(4) - 1];
	}

	private Random rand = new Random();
	private Player player;
	private String output;
}
