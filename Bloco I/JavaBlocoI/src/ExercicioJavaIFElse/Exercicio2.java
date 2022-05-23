package ExercicioJavaIFElse;

import java.util.Scanner;

public class Exercicio2
{

	public static void main(String[] args)
	{		
		int listLength;
		int chave, troca, posicao;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Digite o valor da lista: ");
		listLength = input.nextInt();
		
		int[] vetor = new int[listLength];
		
		for (posicao = 0; posicao < vetor.length; posicao++)
		{
			System.out.print("Digite um valor: ");
			vetor[posicao] = input.nextInt();
		}
				
		for (posicao = 0; posicao < vetor.length; posicao++)
		{
			chave = vetor[posicao];
			troca = posicao - 1;
			while (troca >= 0 && vetor[troca] > chave)
			{
				vetor[troca+1] = vetor[troca];
				troca = troca-1;
			}
			vetor[troca+1] = chave;
		}
		
		for (posicao = 0; posicao < vetor.length; posicao++)
		{
			System.out.println("A ordem da lista é: "+ vetor[posicao]);
		}
	}

}


