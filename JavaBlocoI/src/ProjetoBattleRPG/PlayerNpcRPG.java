package ProjetoBattleRPG;

public class PlayerNpcRPG extends StatusRPG
{
	
	public void paladino()
	{
		this.nome = "Seiya";
		this.lvl = 11;
		this.vigor = 7;
		this.forca = 2;
		this.sor = 4;
	}
	
	public void ladino()
	{
		this.nome = "Ikki";
		this.lvl = 11;
		this.vigor = 3;
		this.des = 9;
		this.sor = 1;
	}
	
	public void maguinho()
	{
		this.nome = "Gandalf";
		this.lvl = 11;
		this.vigor = 3;
		this.intel = 9;
		this.sor = 1;
	}
	
	public void goblin()
	{
		this.nome = "Goblin";
		this.vigor = 5;
	}
	
	
}
