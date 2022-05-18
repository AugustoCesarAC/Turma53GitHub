package ExercicioOrientacaoObjeto.Exercicio1;

public class Aviao
{

	public static void main(String[] args)
	{
		ModeloAviao aviao1 = new ModeloAviao();
		ModeloAviao aviao2 = new ModeloAviao();
		
		aviao1.modelo = "Boeming";
		aviao1.capacidadeTanque = 5000;
		aviao1.assentosMax = 500;
		aviao1.viagemInter();
		aviao1.tipo();
		
		
		System.out.println("");
		aviao2.modelo = "Jatinho";
		aviao2.capacidadeTanque = 2000;
		aviao2.assentosMax = 25;
		aviao2.viagemNacional();
		aviao2.tipo();

		
	}

}
