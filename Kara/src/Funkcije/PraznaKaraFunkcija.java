package Funkcije;

import java.util.Scanner;

public class PraznaKaraFunkcija extends KaraFunkcija {

//	int presledek = 0;
//	int zvezdica;
	public void IzrisKare() {

		KaraFunkcija SirinaPrazna = new KaraFunkcija();
		SirinaPrazna.IzbranoStevilo();

		for (vr = 1; vr <= SirinaPrazna.num / 2 + 1; vr++) {
			Risanje(SirinaPrazna.num - vr, 1);
			
			
		}
		
//		if (vr != 1)
//			System.out.print("*");
//		System.out.println();
//		
//		for (vr = (num / 2); vr >= 1; vr--) {
//
//			for (i = 1; i <= (num - vr); i++) {
//
//				System.out.print(" ");
//			}
//
//			System.out.print("*");
//
//			for (int h = 2; h <= vr * 2 - 2; h++) {
//				System.out.print(" ");
//
//			}
//
//			if (vr != 1)
//				System.out.print("*");
//
//			System.out.println();
//		}

	}

	public void IzrisPraznaKara() {
//		KaraFunkcija SirinaPrazna = new KaraFunkcija();
//		SirinaPrazna.IzbranoStevilo(num);

		KaraFunkcija Izris = new KaraFunkcija();
		// Izris.IzrisKare();

		this.IzrisKare();

//		IzrisKare();

//		KaraFunkcija Risi = new KaraFunkcija();
//		
//		Risi.Risanje(presledek, zvezdica);
//		// zvezdice
//		
//			Izris.IzrisKare();
//			
//			IzrisKare();
//			
//			System.out.print("*");
//			
//			
//
//		for (vr = (SirinaPrazna.num / 2); vr >= 1; vr--) {
//
//			for (i = 1; i <= (SirinaPrazna.num - vr); i++) {
//
//				System.out.print(" ");
//			}
//
//			System.out.print("*");
//
//			for (int h = 2; h <= vr * 2 - 2; h++) {
//				System.out.print(" ");
//
//			}
//
//			if (vr != 1)
//				System.out.print("*");
//
//			System.out.println();
//
//		}
	}

}
