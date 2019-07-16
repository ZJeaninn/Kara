package Funkcije;

import java.util.Scanner;

public class KaraKrizFunkcija {
	void Narisi (int presledek, int zvezda, int minus, int crta) {
		
		
	}
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int num = 0;

		do {
			System.out.println("Izberi stevilo med 3 in 79:");
			num = reader.nextInt();
		} while (num < 3 || num > 79);

		if ((num % 2) == 0)
			num = num - 1;

		System.out.println("Izbrano stevilo je: " + num);

		// zvezdice
		String pr = " ";
		String zv = "*";
		int vr = 0;

		int j = 0;
		int k;
		int i;

		for (vr = 1; vr <= num / 2; vr++) {
			for (i = 1; i <= (num - vr); i++) {

				System.out.print(" ");
			}

			for (k = 1; k <= 1; k++) {
				System.out.print("*");

			}

			for (int h = 2; h <= (vr * 2 - 2) / 2; h++) {
				System.out.print(" ");

			}

			if (vr != 1) {
				for (int n = 1; n <= 1; n++) {
					System.out.print("|");
				}

				for (int h = 2; h <= (vr * 2 - 2) / 2; h++) {
					System.out.print(" ");

				}

				System.out.print("*");
			}
			System.out.println();

		}

		// sredina
		for (vr = 1; vr <= 1; vr++) {
			for (i = 1; i <= (num - vr) - (num / 2); i++) {

				System.out.print(" ");
			}

			for (k = 1; k <= 1; k++) {
				System.out.print("*");

			}

			for (int h = 1; h <= num - 2; h++) {
				System.out.print("-");

			}
			for (int l = 2; l <= 2; l++) {

				System.out.print("*");
			}
			System.out.println("");

		}

		// spodnji del

		for (vr = (num / 2); vr >= 1; vr--) {
			for (i = 1; i <= (num - vr); i++) {

				System.out.print(" ");
			}

			for (k = 1; k <= 1; k++) {
				System.out.print("*");

			}

			for (int h = 2; h <= (vr * 2 - 2) / 2; h++) {
				System.out.print(" ");

			}
			if (vr != 1) {
				for (int n = 1; n <= 1; n++) {
					System.out.print("|");
				}

				for (int h = 2; h <= (vr * 2 - 2) / 2; h++) {
					System.out.print(" ");

				}

				System.out.print("*");
			}

			System.out.println();

		}

	}
}
