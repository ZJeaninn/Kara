package Funkcije;

import java.util.Scanner;

public class KaraKrizFunkcija extends IzbiraKare {

	public  void IzrisKaraKriz() {
		KaraFunkcija SirinaKriz = new KaraFunkcija();
		SirinaKriz.IzbranoStevilo();
		// zvezdice
	
		int vr = 0;
		int k;
		int i;

		for (vr = 1; vr <= SirinaKriz.num / 2; vr++) {
			for (i = 1; i <= (SirinaKriz.num - vr); i++) {

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
			for (i = 1; i <= (SirinaKriz.num - vr) - (SirinaKriz.num / 2); i++) {

				System.out.print(" ");
			}

			for (k = 1; k <= 1; k++) {
				System.out.print("*");

			}

			for (int h = 1; h <= SirinaKriz.num - 2; h++) {
				System.out.print("-");

			}
			for (int l = 2; l <= 2; l++) {

				System.out.print("*");
			}
			System.out.println("");

		}

		// spodnji del

		for (vr = (SirinaKriz.num / 2); vr >= 1; vr--) {
			for (i = 1; i <= (SirinaKriz.num - vr); i++) {

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
