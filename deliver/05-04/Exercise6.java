package loops;

import java.util.Scanner;

public class Exercise6 {
	public static void main(String[] args) {

		int numInt, sumNums = 0, mediaNums, n = 0;

		Scanner read = new Scanner(System.in);

		System.out.println("Entre com um número:");
		numInt = read.nextInt();

		do {
			if (numInt % 3 == 0) {
				sumNums = sumNums + numInt;
				n++;
			}
			System.out.println("Entre com um número:");
			numInt = read.nextInt();
		} while (numInt != 0);

		mediaNums = sumNums / n;

		System.out.printf("A média dos números múltiplos de 3 é: %d ", mediaNums);
	}
}
