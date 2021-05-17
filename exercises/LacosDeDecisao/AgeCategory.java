package lessons;

import java.util.Scanner;

public class AgeCategory {
	
	public static void main(String[] args) {
		
		int age;
		
		Scanner read = new Scanner(System.in);
		
		System.out.println("Digite sua idade: ");
		age = read.nextInt();
		
		if(age >= 10 && age <= 14) {
			System.out.println("De acordo com a sua idade, a categoria é Infantil!");
		}
		else if(age >= 15 && age <= 17) {
			System.out.println("De acordo com a sua idade, a categoria é Juvenil!");
		}
		else if (age >= 18 && age <= 25) {
			System.out.println("De acordo com a sua idade, a categoria é Adulto!");
		}
		else {
			System.out.println("Idade fora do intervalo");
		}
		
	}
}
