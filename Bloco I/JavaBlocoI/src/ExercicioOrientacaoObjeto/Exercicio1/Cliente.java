package ExercicioOrientacaoObjeto.Exercicio1;

public class Cliente
{

	public static void main(String[] args)
	{
		ModeloCliente client1 = new ModeloCliente(1, 15);
		ModeloCliente client2 = new ModeloCliente(2, 20);
		
				
		System.out.println("Cliente Codigo: "+client1.cod);
		client1.nome = "Augusto";
		client1.sobreNome = "Cesar";
		client1.idade = 25;
		
		client1.status();
		client1.objeto();
		client1.debito();
		System.out.println("");
		
		
		System.out.println("Cliente Codigo: "+client2.cod);
		client2.nome = "Luis";
		client2.sobreNome = "Silva";
		client2.idade = 24;
		client2.status();
		client2.objeto();
		client2.credito();
		System.out.println("");		

	}

}
