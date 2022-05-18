package Aula140522;

import java.util.Scanner;

public class ParesImparesPosNeg
{

	public static void main(String[] args)
	{
		int par=0, impar=0, pos=0, neg=0;
		Scanner ler = new Scanner(System.in);
		int listinha[] = new int[5];
		
		listinha[0] = ler.nextInt();
		listinha[1] = ler.nextInt();
		listinha[2] = ler.nextInt();
		listinha[3] = ler.nextInt();
		listinha[4] = ler.nextInt();
		
		for(int posicao = 0; posicao < 5; posicao++)
		{
			if(listinha[posicao]%2 == 0)
				par++;
			if(listinha[posicao]%2 != 0)
				impar++;
			if(listinha[posicao] > 0)
				pos++;
			if(listinha[posicao] < 0)
				neg++;
		}
		System.out.println(par + " valor(es) par(es)");
		System.out.println(impar + " valor(es) impar(es)");
		System.out.println(pos + " valor(es) positivo(s)");
		System.out.println(neg + " valor(es) negativo(s)");

	}

}
