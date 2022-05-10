package ExercicioVetorMatriz;

import java.util.Scanner;
import java.lang.Thread;


public class ExercicioExtraV2
{

	public static void main(String[] args) throws InterruptedException
	{
		Scanner input = new Scanner(System.in);
		char caminho[][] = new char[9][9];
		int a, b;
		char x = '♥';
		int coluna = 0, linha = 0;
		
		
		do
		{
		System.out.print("Digite valores entre 1 à 9\n");
		System.out.print("\nDigite o primeiro número para o bichinho saber aonde precisa ir: ");
		a = input.nextInt()-1;
		System.out.print("Digite o segundo número para o bichinho saber aonde precisa a ir: ");
		b = input.nextInt()-1;		
		
		if(a<0 || a>8 || b<0 || b>8)
			System.out.println("\nNumero fora do limite, favor digitar número de 0 à 8\n");
		
		}while(a<0 || a>8 || b<0 || b>8);
		
		
		for(linha = 0; linha < caminho.length; linha++)
		{
			
			
			for(coluna = 0; coluna < caminho.length; coluna++)
			{
				
				if(linha == 0 && b >= coluna)
				{
					Thread.sleep(60);
					System.out.print("[-]");
				}
				else if(a == linha && b == coluna)
				{
					Thread.sleep(60);
					caminho[linha][coluna] = x;
					System.out.print("["+caminho[linha][coluna]+"]");
				}
				else if(coluna == b && caminho[a][b] != x)
				{
					Thread.sleep(60);
					System.out.print("[-]");
				}
				else if(caminho[a][b] == x)
				{
					Thread.sleep(60);
					System.out.print("[▓]");
				}
				else
				{
					Thread.sleep(60);
					caminho[linha][coluna] = '▓';
					System.out.print("["+caminho[linha][coluna]+"]");
				}
				
			}
			System.out.println("");
		}
		System.out.println("\nParabéns, você encontrou o menor caminho ♥ (ou quase)");
		
		
	}

}
