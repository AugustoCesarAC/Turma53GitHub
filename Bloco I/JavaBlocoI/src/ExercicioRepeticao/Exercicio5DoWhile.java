package ExercicioRepeticao;

import java.util.Scanner;

public class Exercicio5DoWhile
{

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int x, soma = 0;
		
		do
		{
			System.out.print("Digite um valor para ser somado e 'zero' para encerrar o programa: ");
			x = input.nextInt();
			if(x>0)
				soma += x;
		}while(x!=0);
		
		System.out.println("A soma dos valores inseridos são "+soma);
	}

}
