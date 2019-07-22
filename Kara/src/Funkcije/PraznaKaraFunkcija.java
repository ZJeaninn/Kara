package Funkcije;

public class PraznaKaraFunkcija extends KaraFunkcija {

	public void IzrisVrstice(int presledek) {

		int i;

		for (i = 1; i <= presledek; i++) {
			System.out.print(" ");
		}

	}

	public void IzrisKare() {
		int vr;
		KaraFunkcija SirinaPrazna = new KaraFunkcija();
		SirinaPrazna.IzbranoStevilo();

		for (vr = 1; vr <= SirinaPrazna.num / 2 + 1; vr++) {
			this.IzrisVrstice(SirinaPrazna.num - vr);
			System.out.print("*");
			this.IzrisVrstice(vr * 2 - 3);
			if (vr != 1)
				System.out.print("*");

			System.out.println();
		}

		for (vr = (SirinaPrazna.num / 2); vr >= 1; vr--) {

			this.IzrisVrstice(SirinaPrazna.num - vr);
			System.out.print("*");

			this.IzrisVrstice(vr * 2 - 3);
			if (vr != 1)
				System.out.print("*");
			System.out.println();
		}

	}

}
