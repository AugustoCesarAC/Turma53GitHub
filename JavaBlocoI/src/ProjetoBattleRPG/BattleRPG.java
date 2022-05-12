package ProjetoBattleRPG;

import java.util.Random;

public class BattleRPG extends StatusRPG
{

	Random rand = new Random();
	PlayerNpcRPG player = new PlayerNpcRPG();
	
	//ATRIBUTOS
	public int d20 = rand.nextInt(1,21);
	public int hp;
	public double atk; // ATK = FOR - D20
	public double def; // DEF = HP - FOR%
	public int dano; // DANO = ATK - DEF INIMIGO%
	
	//METODO CONSTRUTOR
	public BattleRPG(int x)// X é o valor do ataque principal do personagem
	{	
		this.hp = this.vigor*5;
		this.atk = x + (this.d20*0.25);
		this.def = (this.vigor+(x*0.25));//REDUÇÃO EM PORCENTAGEM
	}
	
	//METODO
	public void battlePhase()
	{
		this.atk = this.atk-(this.atk*(this.def/100));
		if(this.d20 == 20)
			this.atk = this.atk + this.sor*2;
		this.hp -= this.atk;
	}
	
	
}
