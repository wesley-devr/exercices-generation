package arrays;

import java.util.Scanner;

public class Exercise1 {

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
