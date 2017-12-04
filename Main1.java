package GuessTheNumber;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main1 {

	public static void main(String[] args) {

		int[] randNumbers = new int[1];
		for (int i = 0; i < 1; i++) {

			Random r = new Random();
			int a = r.nextInt(101);
			randNumbers[i] = a;
		}
		System.out.println(Arrays.toString(randNumbers));

		Scanner scan = new Scanner(System.in);

		System.out.println("Guess the number");

		while (!scan.hasNextInt()) {
			scan.next();
			System.out.println("It has to be a number");
		}

		

		while (true) {
			int guess = scan.nextInt();

			if (guess > randNumbers[0]) {
				System.out.println("Bigger than the number, try again");
				
			} else if (guess < randNumbers[0]) {
				System.out.println("The number is bigger than this, try again!");
				
			} else {
				System.out.println("good guess!");
				break;
			}

		}

		// System.out.println(guess);

	}
	// dzikei temu wyswietlilo tablice 1 elementowa z wylosowana liczba

}
