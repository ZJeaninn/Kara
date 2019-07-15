import java.util.Scanner;

public class KaraFunkcija {

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
		Scanner reader = new Scanner(System.in);
		int num = 0;

		do {
			System.out.println("Izberi stevilo med 3 in 79:");
			num = reader.nextInt();
		} while (num < 3 || num > 79);

		if ((num % 2) == 0)
			num = num - 1;

		System.out.println("Izbrano stevilo je: " + num);

		// zvezdice
		int vr = 0;
		int k;
		int i;

		for (vr = 1; vr <= num / 2 + 1; vr++) {
			Risanje(num - vr, vr * 2 - 1);
//			for (i = 1; i <= (num - vr); i++) {
//
//				System.out.print(" ");
//			}
//
//			for (k = 1; k <= vr * 2 - 1; k++) {
//				System.out.print("*");
//			}
//			System.out.println();

		}

		for (vr = (num / 2); vr >= 1; vr--) {
			Risanje(num - vr, vr * 2 - 1);
		}

//			for (i = 1; i <= (num - vr); i++) {
//
//				System.out.print(" ");
//			}
//
//			for (k = 1; k <= vr * 2 - 1; k++) {
//				System.out.print("*");
//			}
//			System.out.println();
//
//		}
	}
}
