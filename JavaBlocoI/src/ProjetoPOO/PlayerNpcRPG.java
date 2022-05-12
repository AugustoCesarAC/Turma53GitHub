package ProjetoPOO;

public class PlayerNpcRPG
{

	StatusRPG status = new StatusRPG();
	
	public void paladino()
	{
		status.nome = "Seiya";
		status.lvl = 11;
		status.vigor = 7;
		status.forca = 2;
		status.sor = 4;
	}
	
	public void ladino()
	{
		status.nome = "Ikki";
		status.lvl = 11;
		status.vigor = 3;
		status.des = 9;
		status.sor = 1;
	}
	
	public void maguinho()
	{
		status.nome = "Gandalf";
		status.lvl = 11;
		status.vigor = 3;
		status.intel = 9;
		status.sor = 1;
	}
	
	public void goblin()
	{
		status.nome = "Goblin";
		status.vigor = 5;
	}
	
	public void statsPlayer()
	{
		status.status();
	}
	
}
