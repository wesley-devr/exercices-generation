package arrays;

import java.util.Scanner;

public class Exercise4 {

	public static void main(String[] args) {

		float[][] matriz1 = new float[2][2];
		float[][] matriz2 = new float[2][2];
		float[][] matriz3 = new float[2][2];
		int opt,constant;

		Scanner read = new Scanner(System.in);

		for (int l = 0; l < matriz1.length; l++) {
			for (int col = 0; col < matriz1.length; col++) {
				System.out.println("\nEntre com os valores para a matriz1:");
				matriz1[l][col] = read.nextFloat();
			}
		}

		for (int l = 0; l < matriz2.length; l++) {
			for (int col = 0; col < matriz2.length; col++) {
				System.out.println("\nEntre com os valores para a matriz2:");
				matriz2[l][col] = read.nextFloat();
			}
		}
		
		System.out.println("\nEntre com a constante: ");
		constant = read.nextInt();

		System.out.println("\nEscolha alguma das opções:\n1-somar duas matrizes\n"
				+ "2-subtrair a primeira matriz da segunda\n3-adicionar uma constante as duas matrizes\n"
				+ "4-imprimir as matrizes");
		opt = read.nextInt();

		switch (opt) {
		case 1:
			for (int l = 0; l < 2; l++) {
				for (int col = 0; col < 2; col++) {
					matriz3[l][col] = matriz2[l][col] + matriz1[l][col];
					System.out.println("\nSomatório: " + matriz3[l][col]);
				}
			}
			break;
		case 2:
			for (int l = 0; l < 2; l++) {
				for (int col = 0; col < 2; col++) {
					matriz3[l][col] = matriz2[l][col] - matriz1[l][col];
					System.out.println("\nDiferença: " + matriz3[l][col]);
				}
			}
			break;
		case 3:
			for (int l = 0; l < 2; l++) {
				for (int col = 0; col < 2; col++) {
					matriz1[l][col] = matriz1[l][col] + constant;
					matriz2[l][col] = matriz2[l][col] + constant;

					System.out.println("\nMatriz1: " + matriz1[l][col] + "\t\tMatriz2:" + matriz2[l][col]);
				}
			}
			break;
		case 4:
			for (int l = 0; l < 2; l++) {
				for (int col = 0; col < 2; col++) {
					System.out.println("\nMatriz1: " + matriz1[l][col] + "\t\tMatriz2:" + matriz2[l][col]);
				}
			}
			break;
		}
	}

}
