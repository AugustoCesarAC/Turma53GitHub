package ExercicioVetorMatriz;

import java.util.Scanner;

public class Exercicio4
{

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		int n1[][] = new int[3][3], soma = 0, somaDiagonal = 0;
		
		for(int x = 0; x<3; x++)
		{
			for(int y = 0; y<3; y++)
			{
				n1[x][y] = input.nextInt();
				soma += n1[x][y];
				if(n1[x][y] == n1[x][x])
					somaDiagonal += n1[x][x];
			}
		}
		for(int x = 0; x<3; x++)
		{
			for(int y = 0; y<3; y++)
			{
				System.out.print("["+n1[x][y]+"]");
			}
			System.out.println("");
		}
		System.out.println("Soma de todos os valores: "+soma);
		System.out.println("Soma de todos os valores na diagonal: "+somaDiagonal);
		
	}

}
