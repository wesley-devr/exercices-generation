package lessons;

import java.util.Scanner;

public class AscendingOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,c;
		
		Scanner leia = new Scanner (System.in);
		
		System.out.println("Entre com A: ");
		a = leia.nextInt();
		System.out.println("Entre com B: ");
		b = leia.nextInt();
		System.out.println("Entre com C: ");
		c = leia.nextInt();
		
		if(a<=b && b<=c)
		{
			System.out.println("\nOrdem crescente: "+a+", "+b+" e "+c);
		}
		else if(a<=c && c<=b)
		{
			System.out.println("\nOrdem crescente: "+a+", "+c+" e "+b);
		}
		else if(b<=a && a<=c)
		{
			System.out.println("\nOrdem crescente: "+b+", "+a+" e "+c);
		}
		else if(b<=c && c<=a)
		{
			System.out.println("\nOrdem crescente: "+b+", "+c+" e "+a);
		}
		else if(c<=a && a<=b)
		{
			System.out.println("\nOrdem crescente: "+c+", "+a+" e "+b);
		}
		else
		{
			System.out.println("\nOrdem crescente: "+c+", "+b+" e "+a);
		}
		
	}

}