package IntroducaoPOO;


public class Caneta
{

	public static void main(String[] args)
	{
		ModeloCaneta caneta1 = new ModeloCaneta("Azul", 1.1);
		ModeloCaneta caneta2 = new ModeloCaneta("Preta", 0.5);
		ModeloCaneta caneta3 = new ModeloCaneta("Verde", 0.7);
		
		
		
		System.out.println("Caneta 1");
		caneta1.carga = 80;
		caneta1.destampar();
		caneta1.estadoAtual();
		caneta1.escrever();
		
		System.out.println("");

		System.out.println("Caneta 2");
		caneta2.carga = 50;
		caneta2.destampar();
		caneta2.estadoAtual();
		caneta2.escrever();
		
		System.out.println("");
		
		System.out.println("Caneta 3");
		caneta3.estadoAtual();
		
	}

}
