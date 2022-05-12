package ProjetoBattleRPG;


public class RPG
{

	public static void main(String[] args)
	{
		StatusRPG statsP = new StatusRPG();
		BattleRPG paladino = new BattleRPG(statsP.forca);
		PlayerNpcRPG player1 = new PlayerNpcRPG();
			
		System.out.println("Valor do dado é: "+paladino.d20);
		
		
		int i = 1;
		
		
		if(i == 1) 
		{
			player1.paladino();
			player1.status();
		}
		else
		{
			player1.ladino();
			player1.status();;
		}
		System.out.println("");
		
		player1.altFor();
		
		player1.status();
		
	}

}
