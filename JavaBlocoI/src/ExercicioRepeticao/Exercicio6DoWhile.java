package ExercicioRepeticao;

import java.util.Scanner;

public class Exercicio6DoWhile
{

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int x, cont=0, media = 0;
		
		do
		{
			System.out.print("Digite um valor: ");
			x = input.nextInt();
			if(x%3==0 && x!=0)
			{
				media += x;
				cont++;
			}
			
		}while(x!=0);
		
		System.out.print("A média dos valores são: "+(media/cont));

	}

}
