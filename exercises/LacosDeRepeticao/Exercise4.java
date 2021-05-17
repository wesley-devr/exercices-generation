package loops;

import java.util.Scanner;

public class Exercise4 {
	public static void main(String[] args) {

		int age, sex, factorP, contPeoplesC = 0, contWomanN = 0, contMaleA = 0, contOthersC = 0, contPeoplesN40 = 0,
				contPeoplesC18 = 0, numbersP = 1;

		Scanner leia = new Scanner(System.in);

		while (numbersP <= 5) {
			System.out.println("\nEntre com a sua age: ");
			age = leia.nextInt();
			System.out.println("\n1-Feminino\n2- Masculino\n3- Outros\nEntre com o seu sex: ");
			sex = leia.nextInt();
			System.out.println("\n1- Calmo/a/e\n2- Nervoso/a/e\n3- Agressivo/a/e\nEntre com o fator psicológico: ");
			factorP = leia.nextInt();

			if (factorP == 1) {
				contPeoplesC++;
			}
			if (sex == 1 && factorP == 2) {
				contWomanN++;
			}
			if (sex == 2 && factorP == 3) {
				contMaleA++;
			}
			if (sex == 3 && factorP == 1) {
				contOthersC++;
			}
			if (factorP == 2 && age > 40) {
				contPeoplesN40++;
			}
			if (factorP == 1 && age < 18) {
				contPeoplesC18++;
			}
			numbersP++;

		}
		System.out.println("\nPessoas calmas: " + contPeoplesC);
		System.out.println("\nMulheres nervosas: " + contWomanN);
		System.out.println("\nHomens agressivos: " + contMaleA);
		System.out.println("\nOutros calmos: " + contOthersC);
		System.out.println("\nPessoas nervosas com mais de 40 anos: " + contPeoplesN40);
		System.out.println("\nPessoas calmas com menos de 18 anos: " + contPeoplesC18);
	}

}
