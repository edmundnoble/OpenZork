package openzork;

import java.util.Random;

class Parser {

	public Parser(Location loc, Player player) {
		output = null;

		this.loc = loc;
		this.player = player;
	}

	public String parse(String Input) {
		String input[] = Input.split(" ");
		if (input[0] == "look") {
			output = loc.getNameAndDesc();
		} else if (input[0] == "get") {

		} else if (input[0] == "") {
		} else
			output = notfoundoutputs();
		return output;
	}

	private String notfoundoutputs() {
		String[] randomoutputs = { "What?", "What did you say?",
				"I don't know that command.",
				"ENGLISH, MOTHERFUCKER, DO YOU SPEAK IT?" };
		return randomoutputs[rand.nextInt(3)];
	}

	private Random rand = new Random();
	private Location loc;
	private Player player;
	private String output;
}
