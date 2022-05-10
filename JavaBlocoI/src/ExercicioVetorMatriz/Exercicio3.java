package ExercicioVetorMatriz;

import java.util.Random;
import java.util.Scanner;

public class Exercicio3
{

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		Random rand = new Random();
		
		int n1[][] = new int[4][6], n2[][] = new int[4][6];
		int m1[][] = new int[4][6], m2[][] = new int[4][6];
		
		for(int x = 0; x < 4; x++)
		{
			for(int y = 0; y < 6; y++)
			{
				n1[x][y] = rand.nextInt(9);
				n2[x][y] = rand.nextInt(9);
				m1[x][y] = n1[x][y] + n2[x][y];
				m2[x][y] = n1[x][y] - n2[x][y];
			}
		}
		
		System.out.println("");
		
		for(int x = 0; x < 4; x++)
		{
			for(int y = 0; y < 6; y++)
				System.out.print("["+m1[x][y]+"]");
			System.out.println("");
		}
		
		System.out.println("");
		
		for(int x = 0; x < 4; x++)
		{
			for(int y = 0; y < 6; y++)
				System.out.print("["+m2[x][y]+"]");
			System.out.println("");
		}
	}

}
