package Repeticao;

import java.util.Scanner;

public class ExemploWhile
{

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int n, soma = 0;
		
		System.out.print("Digite um numero para ser somado: ");
		n = input.nextInt();
		
		while(n>=0)
		{
			if(n%2==0)
				soma += n;
			
			System.out.print("Digite um numero para ser somado: ");
			n = input.nextInt();
		}
		System.out.println("A soma dos valores pares foi: "+soma);

	}

}
