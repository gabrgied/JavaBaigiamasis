import java.util.Scanner;

public class Uzd05 {

	public static void main(String[] args) {

		Scanner rd = new Scanner(System.in);

		int p1, p2, p3;

		System.out.println("Pirmojo važiavimo įvertinimas: ");
		p1 = rd.nextInt();
		System.out.println("Antrojo važiavimo įvertinimas: ");
		p2 = rd.nextInt();
		System.out.println("Trečiojo važiavimo įvertinimas: ");
		p3 = rd.nextInt();

		int geriausias = gautiGeriausiaIvertinima(p1, p2, p3);
		System.out.println("Geriausias važiavimo įvertinimas buvo: " + geriausias);
	}

	private static int gautiGeriausiaIvertinima(int a, int b, int c) {
		int best = Math.max(a, (Math.max(c, b)));
		return best;
	}

}
