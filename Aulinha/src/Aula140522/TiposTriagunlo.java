package Aula140522;

import java.util.Scanner;

public class TiposTriagunlo
{

	public static void main(String[] args)
	{
		Scanner ler = new Scanner(System.in);
		double a,b,c, maior = 0, meio = 0, menor = 0;
		
		a = ler.nextDouble();
		b = ler.nextDouble();
		c = ler.nextDouble();
		
		if(a > b && a > c)
		{
			maior = a;
		}
		else if(b > a && b > c)
		{
			maior = b;
		}
		else if(c > a && c > b)
		{
			maior = c;
		}
		////////////////////////////////////////
		if(a < b && a > c || a < c && a > b)
		{
			meio = a;
		}
		else if(b < a && b > c || b < c && b > a)
		{
			meio = b;
		}
		else if(c < a && c > b || c < b && c > a)
		{
			meio = c;
		}
		///////////////////////////////////////
		if(a < b && a < c)
		{
			menor = a;
		}
		else if(b < a && b < c)
		{
			menor = b;
		}
		else if(c < a && c < b)
		{
			menor = c;
		}	
		
		
			
		a = maior;
		b = meio;
		c = menor;
			
		System.out.println("Teste maior " + a);
		System.out.println("Teste meio " + b);
		System.out.println("Teste menor " + c);
		
		a = a*a;
		b = b*b;
		c = c*c;
		
		if(maior >= (meio+menor))
		{
			System.out.println("NAO FORMA TRIANGULO");
		}
		else if(a == (b+c))
		{
			System.out.println("TRIANGULO RETANGULO");
		}
		else if(a > (b+c))
		{
			System.out.println("TRIANGULO OBTUSANGULO");
		}
		else if(a < (b+c))
		{
			System.out.println("TRIANGULO ACUTANGULO");
		}
		
		if(a == b && c == b)
		{
			System.out.println("TRIANGULO EQUILATERO");
		}
		else if(a == b || b == c || c == a)
		{
			System.out.println("TRIANGULO ISOSCELES");
		}
		

	}

}
