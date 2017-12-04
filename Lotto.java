package Lotto;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Lotto {

	public static void main(String[] args) {

		Integer[] arr = new Integer[49];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = i + 1;
		}
		System.out.println(Arrays.toString(arr));
		Collections.shuffle(Arrays.asList(arr));
		System.out.println(Arrays.toString(arr));

		int[] lotto = new int[6];
		for (int i = 0; i < lotto.length; i++) {
			lotto[i] = arr[i];
		}
		Arrays.sort(lotto);
		System.out.println(Arrays.toString(lotto));

		System.out.println("Podaj typowane liczby");

		Scanner scan = new Scanner(System.in);

		int tab[] = new int[6];
		for (int i = 0; i < tab.length; i++) {
			int picks = 0;

			while (true) {
				while (!scan.hasNextInt()) {
					scan.next();
					System.out.println("podaj liczbe");
				}
				picks = scan.nextInt();

				if (picks > 49 && picks > 1) {
					System.out.println("liczba poza zakresem");

				} else {
					break;
				}
				
			} tab[i] = picks;
		}
		Arrays.sort(tab);
		System.out.println("Twoje liczby to: " + (Arrays.toString(tab)));

		int count = 0;

		for (int i = 0; i < lotto.length; i++) {
			if (Arrays.asList(lotto).contains(tab[i]));
				
			count++;
		}
		System.out.println("Trafiles " + count + " liczb");

		while (true) {
			if (Arrays.equals(lotto, tab)) {
				System.out.println("jestes ustwiony do konca zycia");
				break;
			} else {
				System.out.println("nie graj juz wiecej i tak nie trafisz");
				break;
			}
		}

	}

}
