package IntroducaoPOO;


public class Caneta
{

	public static void main(String[] args)
	{
		ModeloCaneta caneta1 = new ModeloCaneta("Azul", 1.1);
		ModeloCaneta caneta2 = new ModeloCaneta("Preta", 0.5);
		ModeloCaneta caneta3 = new ModeloCaneta("Verde", 0.7);
		
		
		
		System.out.println("Caneta 1");
		
		caneta1.setCor("Vermelha");
		caneta1.setPonta(0.8);
		
		caneta1.estadoAtual();
		
		
	}

}
