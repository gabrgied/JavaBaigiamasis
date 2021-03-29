
public class Uzd03 {

	public static void main(String[] args) {

		for (int i = -100; i > -200; i--) {
			System.out.println(i);
			i = i - 2;
		}

		int j = -100;
		do {
			System.out.println(j);
			j = j - 3;
		} while (j < -101 && j > -200);

	}

}
