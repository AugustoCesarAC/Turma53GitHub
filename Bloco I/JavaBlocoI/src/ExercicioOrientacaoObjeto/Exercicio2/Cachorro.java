package ExercicioOrientacaoObjeto.Exercicio2;

public class Cachorro extends Animal
{

	public void escalarCorrer()
	{
		if (correrEscalar == true)
			System.out.println("Animal corre");
		else
			System.out.println("Animal não corre");
	}
	
	@Override
	public void fazSom()
	{
		System.out.println("Late");
	}
	
}
