package ExercicioRepeticao;

import java.util.Scanner;

public class Exercicio2For
{

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int lstNum[] = new int[10], par = 0, impar = 0;
		
		for(int x = 0; x < 10; x++)
		{
			System.out.print("Digite um valor inteiro: ");
			lstNum[x] = input.nextInt();
			if(lstNum[x]%2==0)
				par += 1;
			else
				impar +=1;
		}
		for(int x = 0; x < 10; x++)
		{
			
		}
		System.out.println("Há um total de "+par+" numeros pares"
				+"\nHá um total de "+impar+" numeros impares");

	}

}
