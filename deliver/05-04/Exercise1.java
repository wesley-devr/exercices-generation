package loops;

public class Exercise1 {
	public static void main(String[] args) {

		int numSave;

		for (int i = 1000; i <= 1999; i++) {
			if (i % 11 == 5) {
				numSave = i;
				System.out.println("Número dividido por 11 que tem resto 5 -> " + numSave);
			}
		}
	}
}
