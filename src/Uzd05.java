import java.util.Scanner;

public class Uzd05 {

	public static void main(String[] args) {

		Scanner rd = new Scanner(System.in);

		int p1, p2, p3;

		System.out.println("Pirmojo va�iavimo �vertinimas: ");
		p1 = rd.nextInt();
		System.out.println("Antrojo va�iavimo �vertinimas: ");
		p2 = rd.nextInt();
		System.out.println("Tre�iojo va�iavimo �vertinimas: ");
		p3 = rd.nextInt();

		int geriausias = gautiGeriausiaIvertinima(p1, p2, p3);
		System.out.println("Geriausias va�iavimo �vertinimas buvo: " + geriausias);
	}

	private static int gautiGeriausiaIvertinima(int a, int b, int c) {
		int best = Math.max(a, (Math.max(c, b)));
		return best;
	}

}
