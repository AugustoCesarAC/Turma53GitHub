package ExercicioVetorMatriz;

import java.util.Scanner;

public class Exercicio1
{

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int vetor[] = new int[5], maior=0;
				
		for(int x=0; x<5; x++)
		{
			System.out.println("Digite um numero: " );
			vetor[x] = input.nextInt();
			if(vetor[x] > maior)
				maior += vetor[x];
		}
		
		System.out.println("Maior numero é: "+maior);
		

	}

}
