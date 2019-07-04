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

		int j;
		int k;
		int i;

//		do {
		for (vr = 1; vr <= num / 2; vr++)

		{
			// prva vrsta
			for (i = 1; i <= num / 2; i++)
				System.out.print(pr);
			i = num / 2 - 1;
			{
				for (j = 1; j <= num % 2; j++)
					j = ((num % 2) + j * 2);

				System.out.print(zv);

				System.out.println("");
			}
		}

		// sredina
		for (vr = 1; vr <= num; vr++)
			System.out.print(zv);

//				{
//					// druga vrsta
//					for (vr = 1; vr <= (num / 2) - j; vr++)
//						System.out.print(pr);
//					
//					
//					for (int i = 1; i <= (num % 2) + k; i++)
//						System.out.print(zv);
//					System.out.println("");
//					

//					{
//						// tretja vrsta
//						for (vr = 1; vr <= (num / 2) - 1 - j; vr++)
//
//							System.out.print(pr);
//						for (int i = 1; i <= (num % 2) + 2 * k; i++)
//
//							System.out.print(zv);
//						System.out.println("");
//
//						// cetrta vrsta
//						{
//							for (vr = 1; vr <= (num / 2) - 2 - j; vr++)
//
//								System.out.print(pr);
//							for (int i = 1; i <= (num % 2) + 3 * k; i++)
//
//								System.out.print(zv);
//							System.out.println("");
//						}
//					}

//		} while (vr == num); {
//			vr++;
//		}
//		for (vr = 1; vr <= (num % 2); vr++) {
//			for (vr = 1; vr <= num / 2; vr++)
//
//				System.out.print(pr);
//
//			{
//				for (int i = 1; i <= (num % 2); i++)
//					System.out.print(zv);
//
//			}
//
//			System.out.println("");
//
//			for (vr = 1; vr <= (num / 2) - j; vr++)
//				System.out.print(pr);
//
//			{
//				for (int i = 1; i <= (num % 2) + 2; i++)
//					System.out.print(zv);
//
//			}
//
//			System.out.println("");
//
//			for (vr = 1; vr <= (num / 2) - 2; vr++)
//				System.out.print(pr);
//
//			{
//				for (int i = 1; i <= (num % 2) + 2 * k; i++)
//					System.out.print(zv);
//
//			}
//		}

//		

//		int k = 2;
//		int j = 1;
//		
//		if (vr<num) {
//			 for (vr = 1; vr <= num / 2; vr++)
//				System.out.print(pr);
//
//			{
//				for (int i = 1; i <= (num % 2); i++)
//					System.out.print(zv);
//
//			}
//			
//			System.out.println("");
//			
//			do { 
//				int num1 = num / 2 - j;
//				for (vr = 1; vr <= num1; vr++)
//				
//				System.out.print(pr);
//				
//
//			{
//				int num2 = num % 2 + 2;
//				for (int i = 1; i <= num2; i++)
//					
//					System.out.print(zv);
//				
//
//			}
//			
//			
//
//			System.out.println("");
//			vr++;
//			
//			} while (vr==num);
//			
//		}

	}
}
