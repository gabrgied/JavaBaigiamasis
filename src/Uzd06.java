import java.util.Scanner;

public class Uzd06 {

	public static void main(String[] args) {

		Scanner rd = new Scanner(System.in);
		int Aval, Bval, Amin, Bmin, n, totalMin;
		int x = 0;
		System.out.println("Kiek kartu per diena Jonas mokosi anglu kalbos?");
		n = rd.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.println("Kelinta buvo valanda, kai pradejo mokytis?");
			Aval = rd.nextInt();
			System.out.println("Kiek buvo minuciu, kai pradejo mokytis?");
			Amin = rd.nextInt();
			System.out.println("Kelinta buvo valanda, kai baige mokytis?");
			Bval = rd.nextInt();
			System.out.println("Kiek buvo minuciu, kai baige mokytis?");
			Bmin = rd.nextInt();
			totalMin = gautiTrukmeMinutemis(Aval, Amin, Bval, Bmin);
			x = x + totalMin;
		}
		System.out.println("Is viso Jonas anglu kalbos mokesi " + x + " minuciu");
		int val = x / 60; // tiek valandu..
		int min = x % 60; // ...ir minuciu mokesi
		gautiLaikoFormata(val, min);
	}

	private static int gautiTrukmeMinutemis(int val1, int min1, int val2, int min2) {
		int x = ((val2 * 60) + min2) - ((val1 * 60) + min1);
		return x;
	}

	public static void gautiLaikoFormata(int a, int b) {
		String valandos = String.valueOf(a);
		String minutes = String.valueOf(b);
		System.out.println("O tai yra " + valandos + " val. " + minutes + " min.");
	}
}
