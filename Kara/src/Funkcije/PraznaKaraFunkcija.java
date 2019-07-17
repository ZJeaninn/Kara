package Funkcije;

import java.util.Scanner;

public class PraznaKaraFunkcija extends IzbiraKare {

	public void IzrisPraznaKara() {
		KaraFunkcija SirinaPrazna = new KaraFunkcija();
		SirinaPrazna.IzbranoStevilo();
		// zvezdice
		int vr = 0;
		int i;

		for (vr = 1; vr <= SirinaPrazna.num / 2 + 1; vr++) {
			for (i = 1; i <= (SirinaPrazna.num - vr); i++) {

				System.out.print(" ");
			}

			System.out.print("*");

			for (int h = 2; h <= vr * 2 - 2; h++) {
				System.out.print(" ");

			}

			if (vr != 1)
				System.out.print("*");

			System.out.println();

		}

		for (vr = (SirinaPrazna.num / 2); vr >= 1; vr--) {

			for (i = 1; i <= (SirinaPrazna.num - vr); i++) {

				System.out.print(" ");
			}

			System.out.print("*");

			for (int h = 2; h <= vr * 2 - 2; h++) {
				System.out.print(" ");

			}

			if (vr != 1)
				System.out.print("*");

			System.out.println();

		}
	}
}
