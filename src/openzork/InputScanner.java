package openzork;

import java.util.InputMismatchException;
import java.util.Scanner;

class InputScanner {

	public InputScanner() {
		scanner = new Scanner(System.in);
		output = new String();
	}

	public String Read() {
		try {
			output = scanner.nextLine();
		} catch (InputMismatchException e) {
			output = "notacommand";
		}
		return output;
	}

	private Scanner scanner;
	private String output;
}
