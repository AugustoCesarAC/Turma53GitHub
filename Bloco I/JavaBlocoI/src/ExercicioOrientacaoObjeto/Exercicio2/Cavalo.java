package ExercicioOrientacaoObjeto.Exercicio2;

public class Cavalo extends Animal
{

	public void escalarCorrer()
	{
		if (correrEscalar == true)
			System.out.println("Animal corre");
		else
			System.out.println("Animal n�o corre");
	}
	
	@Override
	public void fazSom()
	{
		System.out.println("Relinchar");
	}
}
