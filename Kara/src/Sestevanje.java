
public class Sestevanje {
	int a = 2;
	int b = 3;

	void Sestej() {
		a = a + b;
		System.out.print(a);
	}

	public static void main(String[] args) {
		
		Sestevanje rezultat = new Sestevanje();
		
		System.out.print("a+b=");
		rezultat.Sestej();

	}

}
