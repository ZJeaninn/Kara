package Funkcije;

import java.util.Scanner;

public class KaraFunkcija extends IzbiraKare {

	public static void Risanje(int presledek, int zvezdica) {

		for (int i = 1; i <= presledek; i++) {
			System.out.print(" ");
		}

		for (int j = 1; j <= zvezdica; j++) {
			System.out.print("*");
		}

		System.out.println("");

	}

	public static void main(String[] args) {
		KaraFunkcija Sirina = new KaraFunkcija();
		Sirina.IzbranoStevilo();
		System.out.println(Sirina.num);

		// zvezdice
		int vr = 0;
		int k;
		int i;

		for (vr = 1; vr <= Sirina.num / 2 + 1; vr++) {
			Risanje(Sirina.num - vr, vr * 2 - 1);

		}

		for (vr = (Sirina.num / 2); vr >= 1; vr--) {
			Risanje(Sirina.num - vr, vr * 2 - 1);
		}

	}
}
