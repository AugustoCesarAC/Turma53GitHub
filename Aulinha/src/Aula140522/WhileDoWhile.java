package Aula140522;

import java.util.Scanner;

public class WhileDoWhile
{

	public static void main(String[] args)
	{
		int i = 0;
		Scanner ler = new Scanner(System.in);
		i = ler.nextInt();
		
		while(i > 0)
			System.out.println("Maior que zero");
		
		do
		{
			System.out.println("É zero mesmo");
			i = ler.nextInt();
		}while(i > 0);

	}

}
