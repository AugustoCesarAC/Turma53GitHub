package ExercicioOrientacaoObjeto;


public class RPG
{

	public static void main(String[] args)
	{
		ModeloRPG char1 = new ModeloRPG();
		ModeloRPG char2 = new ModeloRPG();
		ModeloRPG char3 = new ModeloRPG();
		
		
		char1.nomeChar();
		char1.altFor();
		System.out.println("");
		char1.status();
		
		
		System.out.println("");
		
		char2.nomeChar();
		char2.status();
		
		System.out.println("");
		
		char3.nomeChar();
		char3.status();
	
		
	}

}
