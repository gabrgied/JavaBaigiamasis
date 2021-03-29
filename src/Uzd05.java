import java.util.Scanner;

public class Uzd05 {

	public static void main(String[] args) {

		Scanner rd = new Scanner(System.in);

		int p1, p2, p3;

		System.out.println("Pirmojo vaþiavimo ávertinimas: ");
		p1 = rd.nextInt();
		System.out.println("Antrojo vaþiavimo ávertinimas: ");
		p2 = rd.nextInt();
		System.out.println("Treèiojo vaþiavimo ávertinimas: ");
		p3 = rd.nextInt();

		int geriausias = gautiGeriausiaIvertinima(p1, p2, p3);
		System.out.println("Geriausias vaþiavimo ávertinimas buvo: " + geriausias);
	}

	private static int gautiGeriausiaIvertinima(int a, int b, int c) {
		int best = Math.max(a, (Math.max(c, b)));
		return best;
	}

}
