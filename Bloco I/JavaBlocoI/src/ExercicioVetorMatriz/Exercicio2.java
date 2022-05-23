package ExercicioVetorMatriz;

import java.util.Random;
import java.util.Scanner;

public class Exercicio2
{

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		Random rand = new Random();
		
		int vetor[] = new int[10], media = 0, cont = 0, maior=0;
		
		System.out.println("Os valores do dado lançados são: ");
		
		for(int x = 0; x < 10; x++)
		{
			vetor[x] = rand.nextInt(6)+1;
			media += vetor[x];
			if(vetor[x] > maior)
				maior = vetor[x];
			System.out.print("["+vetor[x]+"]");
		}
		
		for(int x = 0; x < 10; x++)
			if(maior == vetor[x])
				cont++;
		
		System.out.print("\nA quantidade de vezes que o maior número foi lançado foram: "+cont);
		
		
	}

}
