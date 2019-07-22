package Funkcije;

import java.util.Scanner;


public class IzbiraKare {

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

	public static void main(String[] args) {
		Scanner vnos = new Scanner(System.in);
		System.out.println("Izberite stevilo pred zeljenim izpisom oblike\n" 
		+ "1: Izris kare\n" 
		+ "2: Izris prazne kare\n"
		+ "3: Izris kare s krizem.");
		int m = vnos.nextInt();
		switch (m) {
		case 1:
			KaraFunkcija Kara = new KaraFunkcija();
			Kara.IzrisKare();
			break;
		case 2:
			PraznaKaraFunkcija PraznaKara = new PraznaKaraFunkcija();
			PraznaKara.IzrisPraznaKara();
			break;
		case 3:
			KaraKrizFunkcija KrizKara = new KaraKrizFunkcija();
			KrizKara.IzrisKaraKriz();
			break;
		default:
			System.out.println("Niste pravilno izbrali.");
		}

	}

}
