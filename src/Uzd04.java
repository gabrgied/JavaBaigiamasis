import java.util.Scanner;

public class Uzd04 {

	public static void main(String[] args) {

		Scanner rd = new Scanner(System.in);

		int a, b;
		int counter = 0;// kiek yra laimingu skaiciu//

		System.out.println("�veskite intervalo prad�i�: ");
		a = rd.nextInt();

		System.out.println("�veskite intervalo pabaig�: ");
		b = rd.nextInt();

		for (int i = a; i <= b; i++) {
			if (i % 6 == 0) {
				counter++;
			}
		}
		System.out.print("Reik�s u�sakyti " + counter + " mar�kin�lius(-i�)");

	}
}
