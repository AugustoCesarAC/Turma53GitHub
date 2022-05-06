package ExercicioJavaIFElse;

import java.util.Scanner;

public class Exercicio2
{

	public static void main(String[] args)
	{
		int[] vetor = new int[3];
		int chave, i;
		Scanner input = new Scanner(System.in);
		
		for (int j = 0; j < 3; j++)
		{
			System.out.print("Digite um valor: ");
			vetor[j] = input.nextInt();
		}
		
		for (int j = 0; j < 3; j++)
		{
			chave = vetor[j];
			i = j - 1;
			while (i >= 0 && vetor[i] > chave)
			{
				vetor[i+1] = vetor[i];
				i = i-1;
			}
			vetor[i+1] = chave;
		}
		for (int j = 0; j < 3; j++)
		{
			System.out.println("A ordem da lista é: "+ vetor[j]);
		}
	}

}


