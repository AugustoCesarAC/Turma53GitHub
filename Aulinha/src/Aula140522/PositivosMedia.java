package Aula140522;

import java.util.Scanner;

public class PositivosMedia
{

	public static void main(String[] args)
	{
		double a, b, c, d, e, f, media = 0, contador = 0;
		Scanner ler = new Scanner(System.in);
		
		a = ler.nextDouble();
		b = ler.nextDouble();
		c = ler.nextDouble();
		d = ler.nextDouble();
		e = ler.nextDouble();
		f = ler.nextDouble();
		
		if(a > 0)
		{
			media = media + a;
			contador++;
		}
		if(b > 0)
		{
			media = media + b;
			contador++;
		}
		if(c > 0)
		{
			media = media + c;
			contador++;
		}
		if(d > 0)
		{
			media = media + d;
			contador++;
		}
		if(e > 0)
		{
			media = media + e;
			contador++;
		}
		if(f > 0)
		{
			media = media + f;
			contador++;
		}
		System.out.println(contador + " valores positivos");
		media = media/contador;
		System.out.println("Media: " + media);

	}

}
