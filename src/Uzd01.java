import java.util.Scanner;

public class Uzd01 {

	public static void main(String[] args) {

		Scanner reader = new Scanner(System.in);

		int pam1, pam2, pam3, pam4, pam5, min, viso;
		System.out.print("Kiek pamoku tures pirmadieni? ");
		pam1 = reader.nextInt();
		System.out.print("Kiek pamoku tures antradieni? ");
		pam2 = reader.nextInt();
		System.out.print("Kiek pamoku tures treciadieni? ");
		pam3 = reader.nextInt();
		System.out.print("Kiek pamoku tures ketvirtadieni?");
		pam4 = reader.nextInt();
		System.out.print("Kiek pamoku tures penktadieni? ");
		pam5 = reader.nextInt();
		reader.close();
		viso = pam1 + pam2 + pam3 + pam4 + pam5;
		min = viso * 45;

		System.out.println("Is viso bus pamoku per savaite: " + viso);
		System.out.print("Is viso truks " + min + " minuciu per savaite");

	}
}
