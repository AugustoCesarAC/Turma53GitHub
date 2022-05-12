package ExercicioOrientacaoObjeto;

public class DiscoveryChannel
{

	public static void main(String[] args)
	{
		Cachorro pingo = new Cachorro();
		Cavalo peDePano = new Cavalo();
		Preguica sloth = new Preguica();
		
		pingo.nome = "Pingo";
		pingo.idade = 15;
		pingo.fazSom();
		pingo.verdadeiroCorrer();
		
		
		pingo.resutaldo();
		pingo.escalarCorrer();
		
		System.out.println("");
		
		peDePano.nome = "Pé de Pano";
		peDePano.idade = 6;
		peDePano.fazSom();
		peDePano.verdadeiroCorrer();
		
		peDePano.resutaldo();
		peDePano.escalarCorrer();
		
		System.out.println("");
		
		sloth.nome = "Augusto Cesar";
		sloth.idade = 25;
		sloth.fazSom();
		
		sloth.resutaldo();
		sloth.escalarCorrer();

	}

}
