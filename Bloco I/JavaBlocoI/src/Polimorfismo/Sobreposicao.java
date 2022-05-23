package Polimorfismo;

public class Sobreposicao
{

	public static void main(String[] args)
	{
		Cachorro pingo = new Cachorro();
		Papagaio loro = new Papagaio();
		
		System.out.println("CACHORRO");
		pingo.locomover();
		System.out.println("PAPAGAIO");
		loro.locomover();

	}

}
