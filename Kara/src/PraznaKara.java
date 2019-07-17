import java.util.Scanner;

public class PraznaKara {
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

		int i;

		for (vr = 1; vr <= num / 2 + 1; vr++) {
			for (i = 1; i <= (num - vr); i++) {

				System.out.print(" ");
			}

			System.out.print("*");

			for (int h = 2; h <= vr * 2 - 2; h++) {
				System.out.print(" ");

			}

			if (vr != 1)
				System.out.print("*");

			System.out.println();

		}

		for (vr = (num / 2); vr >= 1; vr--) {

			for (i = 1; i <= (num - vr); i++) {

				System.out.print(" ");
			}

			System.out.print("*");

			for (int h = 2; h <= vr * 2 - 2; h++) {
				System.out.print(" ");

			}

			if (vr != 1)
				System.out.print("*");

			System.out.println();

		}
	}
}
