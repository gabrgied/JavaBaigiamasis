import java.util.Scanner;

public class Uzd02 {

	public static void main(String[] args) {

		Scanner reader = new Scanner(System.in);

		int k, d, n;
		System.out.println("Kiek knygø telpa á dëþæ?");
		n = reader.nextInt();
		System.out.print("Kiek knygø reikia supakuoti? ");
		k = reader.nextInt();

		reader.close();

		d = k / n; // tiek deziu reikes
		int liks = k % n; // tiek liks nesupakuota
		System.out.println("Knygoms supakuoti reiks " + d + " dëþiø");
		System.out.print("Liks nesupakuota " + liks + " knygø");
	}

}
