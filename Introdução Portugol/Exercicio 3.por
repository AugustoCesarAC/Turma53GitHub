programa
{
	
	funcao inicio()
	{
		inteiro durInicial, durFinal, hora, minuto, segundo
		escreva("Digite o tempo de entrada em segundo: ")
		leia(durInicial)
		escreva("\nDigite o tempo de saída em segundo: ")
		leia(durFinal)
		durFinal = durFinal - durInicial
		hora = durFinal/3600
		minuto = (durFinal - (hora*3600))/60
		segundo = (durFinal - (hora*3600) - (minuto*60))
		escreva("Duração do evento foi de: ", hora, " hora(s), ", minuto, " minuto(s) e ", segundo, " segundo(s)\n")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 498; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */