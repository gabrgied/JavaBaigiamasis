
public class AlgoritmaiGabriele {

	public static void print(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.println("a" + i + " - " + array[i]);
		}
	}

	public static boolean equals(int[] array1, int[] array2) {
		if (array1 == array2) {
			return true;
		}
		if (null == array1 || null == array2) {
			return false;
		}
		if (array1.length != array2.length) {
			return false;
		}
		for (int i = 0; i < array1.length; i++) {
			if (array1[i] != array2[i]) {
				return false;
			}
		}
		return true;
	}
}
