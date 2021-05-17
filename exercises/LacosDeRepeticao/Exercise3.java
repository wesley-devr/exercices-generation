package loops;

import java.util.Scanner;

public class Exercise3 {
	public static void main(String[] args) {

		int idade, contP21 = 0, contP50 = 0;

		Scanner read = new Scanner(System.in);

		System.out.println("\nEntre com a idade: ");
		idade = read.nextInt();

		while (idade < 1 || idade > 120) {
			System.out.println("\nEntre com uma nova idade: ");
			idade = read.nextInt();
		}
		while (idade != -99) {
			if (idade < 21) {
				contP21++;
			}
			if (idade > 50) {
				contP50++;
			}

			System.out.println("\nEntre com a idade: ");
			idade = read.nextInt();
		}
		System.out.println("\nTemos " + contP21 + " pessoas com menos de 21 anos...");
		System.out.println("\nTemos " + contP50 + " pessoas com mais de 50 anos...");
	}

}
