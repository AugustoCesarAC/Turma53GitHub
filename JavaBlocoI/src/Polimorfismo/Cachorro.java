package Polimorfismo;

public class Cachorro extends Pet
{

	private String raca;
	private String cor;
	
	@Override
	public void locomover()
	{
		System.out.println("Correndo...");
	}
	
	@Override
	public void emitirSom()
	{
		System.out.println("Latir..");
	}
	
}
