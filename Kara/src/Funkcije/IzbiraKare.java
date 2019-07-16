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
		IzbiraKare MojeSt = new IzbiraKare();

		MojeSt.IzbranoStevilo();

		System.out.println("Main: "+MojeSt.num);

	}

}
