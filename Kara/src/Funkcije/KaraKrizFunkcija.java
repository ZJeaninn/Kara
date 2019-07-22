package Funkcije;

import java.util.Scanner;

public class KaraKrizFunkcija extends KaraFunkcija {

	public void IzrisVrstice(int presledek) {
		int i;

		for (i = 1; i <= presledek; i++) {
			System.out.print(" ");
		}

	}

	public void IzrisCrta(int crta) {
		int j;

		for (j = 1; j <= crta; j++) {
			System.out.print("|");
		}
	}

	public void IzrisKare() {
		int vr;
		KaraFunkcija KrizSirina = new KaraFunkcija();
		KrizSirina.IzbranoStevilo();

		for (vr = 1; vr <= KrizSirina.num / 2; vr++) {
			this.IzrisVrstice(KrizSirina.num - vr);
			System.out.print("*");
			this.IzrisVrstice((vr * 2 - 3) / 2);
			if (vr != 1) {
				System.out.print("|");
				this.IzrisVrstice((vr * 2 - 3) / 2);
				System.out.print("*");
			}
			System.out.println();
		}

		// sredina

		this.IzrisVrstice(KrizSirina.num / 2);
		System.out.print("*");

		for (vr = 1; vr <= KrizSirina.num - 2; vr++) {
			System.out.print("-");

		}
		System.out.print("*");
		System.out.println("");
		// spodnji del

		for (vr = KrizSirina.num / 2; vr >= 1; vr--) {
			this.IzrisVrstice(KrizSirina.num - vr);
			System.out.print("*");
			this.IzrisVrstice((vr * 2 - 3) / 2);
			if (vr != 1) {
				System.out.print("|");
				this.IzrisVrstice((vr * 2 - 3) / 2);
				System.out.print("*");
			}
			System.out.println();

		}
	}

}

//	public void IzrisKaraKriz() {
//		KaraFunkcija SirinaKriz = new KaraFunkcija();
//		SirinaKriz.IzbranoStevilo();
//		// zvezdice
//
//		int vr = 0;
//		int k;
//		int i;
//
//		for (vr = 1; vr <= SirinaKriz.num / 2; vr++) {
//			for (i = 1; i <= (SirinaKriz.num - vr); i++) {
//
//				System.out.print(" ");
//			}
//
//			for (k = 1; k <= 1; k++) {
//				System.out.print("*");
//
//			}
//
//			for (int h = 2; h <= (vr * 2 - 2) / 2; h++) {
//				System.out.print(" ");
//
//			}
//
//			if (vr != 1) {
//				for (int n = 1; n <= 1; n++) {
//					System.out.print("|");
//				}
//
//				for (int h = 2; h <= (vr * 2 - 2) / 2; h++) {
//					System.out.print(" ");
//
//				}
//
//				System.out.print("*");
//			}
//			System.out.println();
//
//		}
//
//		// sredina
//		for (vr = 1; vr <= 1; vr++) {
//			for (i = 1; i <= (SirinaKriz.num - vr) - (SirinaKriz.num / 2); i++) {
//
//				System.out.print(" ");
//			}
//
//			for (k = 1; k <= 1; k++) {
//				System.out.print("*");
//
//			}
//
//			for (int h = 1; h <= SirinaKriz.num - 2; h++) {
//				System.out.print("-");
//
//			}
//			for (int l = 2; l <= 2; l++) {
//
//				System.out.print("*");
//			}
//			System.out.println("");
//
//		}
//
//		// spodnji del
//
//		for (vr = (SirinaKriz.num / 2); vr >= 1; vr--) {
//			for (i = 1; i <= (SirinaKriz.num - vr); i++) {
//
//				System.out.print(" ");
//			}
//
//			for (k = 1; k <= 1; k++) {
//				System.out.print("*");
//
//			}
//
//			for (int h = 2; h <= (vr * 2 - 2) / 2; h++) {
//				System.out.print(" ");
//
//			}
//			if (vr != 1) {
//				for (int n = 1; n <= 1; n++) {
//					System.out.print("|");
//				}
//
//				for (int h = 2; h <= (vr * 2 - 2) / 2; h++) {
//					System.out.print(" ");
//
//				}
//
//				System.out.print("*");
//			}
//
//			System.out.println();
//
//		}