package Repeticao;

import java.util.Scanner;

public class ExemploFor
{

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int n;
		System.out.println("TABUADA DO 4\n");
		
		for(int x = 1; x <= 10; x++)
			System.out.println("4 X " + x + " = " + (4*x));
			
		System.out.println("Escolha uma tabuada: ");
		n = input.nextInt();
		for(int x = 1; x <= 10; x++)
			System.out.println(n + " X " + x + " = " + n*x);
		

	}

}
