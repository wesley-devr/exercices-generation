package arrays;

import java.util.Scanner;

public class Exercise3 {

	public static void main(String[] args) {

		int[][] matriz = new int[3][3];
		int cont10 = 0;

		Scanner read = new Scanner(System.in);

		for (int l = 0; l < 3; l++) {
			for (int c = 0; c < 3; c++) {
				System.out.println("Entre com um número: ");
				matriz[l][c] = read.nextInt();

				if (matriz[l][c] > 10) {
					cont10++;
				}
			}

		}

		System.out.printf("\nA quantidade de números maiores que 10 são: %d", cont10);

	}

}
