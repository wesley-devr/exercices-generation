package lessons;

import java.util.Scanner;

public class InputPairOdd {

	public static void main(String[] args) {
		
		int number; 
		double sqrt, pow;
		
		Scanner read = new Scanner(System.in);
		
		System.out.println("Escreva um número: ");
		number = read.nextInt();
		
		if(number % 2 == 0) {
			sqrt = Math.sqrt(number);
			System.out.println("Número é par e a raiz quadrada do seu número é "+sqrt);
		}
		else {
			pow = Math.pow(number, 2);
			System.out.println("Número é impar e o seu número elevado ao quadrado é "+pow);
		}
		
		
		
	}

}
