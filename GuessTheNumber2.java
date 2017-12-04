package GuessTheNumber2;

import java.util.Scanner;

public class GuessTheNumber2 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Pomysl liczbe od 0 do 100, a ja odgadne w max 10 probach.");
		System.out.println("Odpowiedz za duzo, za malo lub zgadles");

		//while (true) {
			int min = 0;
			int max = 100;

			int count = 0;
			
			while (count <= 10) {

				int guess = (max - min) / 2 + min;

				System.out.println("Zgaduje: " + guess);

				String comand = scan.nextLine();
		

				if (comand.equals("za duzo")) {
					max = guess;
					count++;

				} else if (comand.equals("za malo")) {
					min = guess;
					count++;

				} else if (comand.equals("zgadles")) {
					break;
				} else if (count == 10) {
					System.out.println("Nie oszukuj!");
				}

			}

		}
	//}
}
