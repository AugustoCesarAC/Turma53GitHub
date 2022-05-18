package Aula140522;

import java.util.Scanner;

public class FormulaBhaskara
{

	public static void main(String[] args)
	{
		Scanner ler = new Scanner(System.in);
		double a, b, c, delta, r1, r2;
		
		a = ler.nextDouble();
		b = ler.nextDouble();
		c = ler.nextDouble();
		
		delta = (b*b)-(4*a*c);
		
		if(delta < 0 || a == 0)
			System.out.println("Impossivel calcular");
		else
		{
			delta = Math.sqrt(delta);
			r1 = ((b*-1) + delta) / (2*a);
			System.out.printf("R1 = %.5f%n", r1);
			r2 = ((b*-1) - delta) / (2*a);
			System.out.printf("R2 = %.5f%n",r2);
			
		}
	}

}
