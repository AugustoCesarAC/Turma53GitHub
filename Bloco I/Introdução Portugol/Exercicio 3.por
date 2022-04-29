programa
{
	
	funcao inicio()
	{
		inteiro duracao, hora, minuto, segundo
		escreva("Digite o tempo de entrada em segundo: ")
		leia(duracao)
		hora = duracao/3600
		minuto = (duracao - (hora*3600))/60
		segundo = (duracao - (hora*3600) - (minuto*60))
		escreva("Duração do evento foi de: ", hora, " hora(s), ", minuto, " minuto(s) e ", segundo, " segundo(s)\n")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 141; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */