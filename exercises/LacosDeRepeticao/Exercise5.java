package loops;

import java.util.Scanner;

public class Exercise5 {

	public static void main(String[] args) {

		int num, sumNum = 0;

		Scanner read = new Scanner(System.in);

		do {
			System.out.println("Entre com um número:");
			num = read.nextInt();
			sumNum = sumNum + num;

		} while (num != 0);

		System.out.println("A soma dos número digitados é: " + sumNum);

	}
}
