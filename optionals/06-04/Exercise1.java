package arrays;

import java.util.Scanner;

public class Exercise1 {

	/*
	 * Faça um programa que possua um vetor denominado A que armazene 6 números
	 * inteiros. O programa deve executar os seguintes passos: (a) Atribua os
	 * seguintes valores a esse vetor: 1, 0, 5, -2, -5, 7. (b) Armazene em uma
	 * variável inteira (simples) a soma entre os valores das posições A[0], A[1] e
	 * A[5] do vetor e mostre na tela esta soma. (c) Modifique o vetor na posição 4,
	 * atribuindo a esta posição o valor 100. (d) Mostre na tela cada valor do vetor
	 * A, um em cada linha.
	 * 
	 */

	public static void main(String[] args) {

		int[] A = new int[6];
		int soma=0, val;
		
		Scanner read = new Scanner(System.in);
		
		for(int i = 0; i < A.length; i++)
		{
			System.out.println("Entre com um número: ");
			A[i] = read.nextInt();
		}
		
		soma = A[0] + A[1] + A[5];
		
		A[4] = 100;
		System.out.printf("\nSoma dos valores A[0], A[1] e A[5] = %d", soma);
		
		System.out.println("\n");
		
		for(int i = 0; i < A.length; i++) {
			
			System.out.println("Valor do vetor: " + A[i]);
		}
		
	}

}
