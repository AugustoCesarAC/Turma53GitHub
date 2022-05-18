package Exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exemplo2
{

	public static void main(String[] args)
	{
		int n1, n2;
		Scanner input = new Scanner(System.in);
		System.out.println("digite os n�meros da divis�o: ");
		try {
			n1=input.nextInt();
			n2=input.nextInt();
			System.out.println(n1/n2);
		}catch(ArithmeticException erro) {
			System.out.println("Erro, n�o � poss�vel divisao por ZERO"+erro);
		}catch(InputMismatchException erro) {
			System.out.println("Tipo de dado incompat�vel "+erro);
		}
		System.out.println("FIM DO PROGRAMA!!!");

	}

}
