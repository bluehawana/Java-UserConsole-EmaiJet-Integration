package se.dsve.input;

import java.util.Scanner;

public class InputHelper {
	private static Scanner scanner;

	public InputHelper() {
		scanner = new Scanner(System.in);
	}

	public static String readString() {
//		System.out.print("Ange en sträng: ");
		return scanner.nextLine();
	}

	public int readInt() {
		int number = 0;
		boolean valid = false;
		while (! valid) {
//			System.out.print("Ange ett heltal: ");
			if (scanner.hasNextInt()) {
				number = scanner.nextInt();
				valid = true;
			} else {
				System.out.println("Det är inte ett giltigt heltal. Försök igen.");
			}
			scanner.nextLine();
		}
		return number;
	}

	public void close() {
		if (scanner != null) {
			scanner.close();
		}
	}
}
