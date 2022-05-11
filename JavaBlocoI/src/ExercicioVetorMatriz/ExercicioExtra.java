package ExercicioVetorMatriz;

import java.util.Scanner;
import java.lang.Thread;


public class ExercicioExtra
{

	public static void main(String[] args) throws InterruptedException
	{
		Scanner input = new Scanner(System.in);
		char caminho[][] = new char[9][9];
		int a, b;
		char x = '♥';
		
		
		do
		{
		System.out.print("Digite valores entre 1 à 9\n");
		System.out.print("\nDigite o primeiro número para o bichinho saber aonde precisa ir: ");
		a = input.nextInt()-1;
		System.out.print("Digite o segundo número para o bichinho saber aonde precisa a ir: ");
		b = input.nextInt()-1;		
		
		if(a<0 || a>8 || b<0 || b>8)
			System.out.println("\nNumero fora do limite, favor digitar número de 1 à 9\n");
		
		}while(a<0 || a>8 || b<0 || b>8);
		
		
		for(int linha = 0; linha < caminho.length; linha++)
		{
			for(int coluna = 0; coluna < caminho.length; coluna++)
			{
				if(a == linha && b == coluna)
				{
					Thread.sleep(60);
					caminho[linha][coluna] = x;
					System.out.print("["+caminho[linha][coluna]+"]");
				}
				else if(caminho[a][b] == x)
				{
					Thread.sleep(60);
					System.out.print("[▓]");
				}
				else
				{
					Thread.sleep(60);
					caminho[linha][coluna] = '-';
					System.out.print("["+caminho[linha][coluna]+"]");
				}
				
			}
			System.out.println("");
		}
		System.out.println("\nParabéns, você chegou no final do caminho ♥");
		
		
	}

}
