import java.util.Scanner;

public class Kara {

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
		String pr = " ";
		String zv = "*";
		int vr = 0;

//		for (vr = 1; vr <= num/2; vr++) {
//			System.out.print("ena");}
//			for (vr = 1; vr <= num; vr++) 
//				System.out.println("dva");

		for (vr = 1; vr <= num / 2; vr++)
			System.out.print(pr);
		{
			for (int i = 1; i <= (num % 2); i++)
				System.out.print(zv);

		}

//		for (vr = 1; vr >= num; vr++) {
//			for (num = 1; num > vr; num++) {
//				System.out.print(" ");
//			}
//			for (int i = 1; i < (vr * 2); i++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}

//		for (vr = 1; vr <= num; vr++) {
//			for (int i = 1; i < num; i++)
//				System.out.print(pr);
//			for (int j = 1; j < (num * 2); j = +2)
//				System.out.print(zv);
//			System.out.println();
//		}

	}
}
