package Exception;

import java.util.Scanner;

public class Exemplo1
{

	public static void main(String[] args)
	{
		int n1, n2;
		Scanner input = new Scanner(System.in);
		System.out.println("digite os n�meros para divis�o: ");
		try {
			n1=input.nextInt();
			n2=input.nextInt();
			System.out.println("\nA divis�o �: "+n1/n2);
		}catch(Exception erro) {
			System.out.println("Voc� cometeu um erro"+erro);
		}
		System.out.println("FIM DO PROGRAMA!!!");

	}

}
