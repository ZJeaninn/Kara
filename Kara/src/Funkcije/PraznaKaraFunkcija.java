package Funkcije;

import java.util.Scanner;

public class PraznaKaraFunkcija extends KaraFunkcija {

	public void IzrisKare() {

		KaraFunkcija SirinaPrazna = new KaraFunkcija();
		SirinaPrazna.IzbranoStevilo();

		for (vr = 1; vr <= SirinaPrazna.num / 2 + 1; vr++) {
			Risanje(SirinaPrazna.num - vr, 1);

		}

	}

	public void IzrisPraznaKara() {

		KaraFunkcija Izris = new KaraFunkcija();

		this.IzrisKare();

	}

}
