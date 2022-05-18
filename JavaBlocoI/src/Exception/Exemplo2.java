package Exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exemplo2
{

	public static void main(String[] args)
	{
		int n1, n2;
		Scanner input = new Scanner(System.in);
		System.out.println("digite os números da divisão: ");
		try {
			n1=input.nextInt();
			n2=input.nextInt();
			System.out.println(n1/n2);
		}catch(ArithmeticException erro) {
			System.out.println("Erro, não é possível divisao por ZERO"+erro);
		}catch(InputMismatchException erro) {
			System.out.println("Tipo de dado incompatível "+erro);
		}
		System.out.println("FIM DO PROGRAMA!!!");

	}

}
