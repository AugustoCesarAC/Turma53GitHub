package ExercicioOrientacaoObjeto.Exercicio2;

public class Preguica extends Animal
{

	public void escalarCorrer()
	{
		if (correrEscalar == true)
			System.out.println("Animal corre");
		else
			System.out.println("Animal escala �rvores");
	}
	
	@Override
	public void fazSom()
	{
		System.out.println("N�o faz muito som");
	}
	
}
