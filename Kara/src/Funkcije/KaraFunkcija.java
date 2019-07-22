package Funkcije;

import java.util.Scanner;

public class KaraFunkcija {

	public int num = 0;

	public void IzbranoStevilo() {
		Scanner reader = new Scanner(System.in);

		do {
			System.out.println("Izberi stevilo med 3 in 79:");
			num = reader.nextInt();
		} while (num < 3 || num > 79);

		if ((num % 2) == 0)
			num = num - 1;

		System.out.println("Izbrano stevilo je: " + num);
	}

	public void IzrisVrstice(int presledek, int zvezdica) {

		int i;

		for (i = 1; i <= presledek; i++) {
			System.out.print(" ");
		}

		for (i = 1; i <= zvezdica; i++) {
			System.out.print("*");
		}

		System.out.println("");

	}

	public void IzrisKare() {

		int vr;
		KaraFunkcija Sirina = new KaraFunkcija();
		Sirina.IzbranoStevilo();
		
		// zvezdice

		for (vr = 1; vr <= Sirina.num / 2 + 1; vr++) {
			IzrisVrstice(Sirina.num - vr, vr * 2 - 1);

		}

		for (vr = Sirina.num / 2; vr >= 1; vr--) {
			IzrisVrstice(Sirina.num - vr, vr * 2 - 1);
		}

	}

}
