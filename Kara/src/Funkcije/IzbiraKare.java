package Funkcije;

import java.util.Scanner;

public class IzbiraKare {

	public static void main(String[] args) {
		Scanner vnos = new Scanner(System.in);
		System.out.println("Izberite stevilo pred zeljenim izpisom oblike\n" + "1: Izris kare\n"
				+ "2: Izris prazne kare\n" + "3: Izris kare s krizem.");
		int m = vnos.nextInt();
		switch (m) {
		case 1:
			KaraFunkcija Kara = new KaraFunkcija();
			Kara.IzrisKare();
			break;
		case 2:
			PraznaKaraFunkcija PraznaKara = new PraznaKaraFunkcija();
			PraznaKara.IzrisKare();
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
