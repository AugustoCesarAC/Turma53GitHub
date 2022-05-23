package Exception;

import java.util.Scanner;

public class Exemplo1
{

	public static void main(String[] args)
	{
		int n1, n2;
		Scanner input = new Scanner(System.in);
		System.out.println("digite os números para divisão: ");
		try {
			n1=input.nextInt();
			n2=input.nextInt();
			System.out.println("\nA divisão é: "+n1/n2);
		}catch(Exception erro) {
			System.out.println("Você cometeu um erro"+erro);
		}
		System.out.println("FIM DO PROGRAMA!!!");

	}

}
