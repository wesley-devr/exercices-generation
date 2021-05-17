package arrays;

import java.util.Scanner;

public class Exercise2 {

	public static void main(String[] args) {

		int contImpar = 0, somaPar = 0, i;
		int[] numInts = new int[6];

		Scanner read = new Scanner(System.in);

		for (i = 0; i < numInts.length; i++) {
			System.out.println("Entre com um número:");
			numInts[i] = read.nextInt();

			if (numInts[i] % 2 == 0) {
				somaPar = somaPar + numInts[i];
			} else {
				contImpar++;
			}
		}

		for (i = 0; i < 6; i++) {
			if (numInts[i] % 2 == 0) {
				System.out.println("É um número par -> " + numInts[i]);
			} else {
				System.out.println("É um número impar -> " + numInts[i]);
			}
		}

		System.out.println("\nA soma dos números pares digitados foi: " + somaPar);
		System.out.println("\nA quantidade de números ímpares digitados foi: " + contImpar);
	}
}
