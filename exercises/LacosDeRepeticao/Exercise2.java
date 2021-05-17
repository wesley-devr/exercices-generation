package loops;

import java.util.Scanner;

public class Exercise2 {
	public static void main(String[] args) {

		int num, contPair = 0, contOdd = 0;

		Scanner read = new Scanner(System.in);

		for (int i = 0; i <= 10; i++) {
			System.out.println("Entre com um número: ");
			num = read.nextInt();

			if (num % 2 == 0) {
				contPair++;
			} else {
				contOdd++;
			}
		}

		System.out.println("Total de números pares são " + contPair + " e total de números ímpares são " + contOdd + ".");
	}
}
