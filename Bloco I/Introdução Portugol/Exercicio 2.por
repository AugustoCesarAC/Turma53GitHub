programa
{
	
	funcao inicio()
	{
		inteiro idade, anos, meses, dias
		escreva("Digite a sua idade em dias: ")
		leia(dias)
		anos = dias/365
		meses = (dias-(anos*365))/30
		dias = (dias-(anos*365)-(meses*30))
		escreva("Possui um total de: ", anos, " anos, ", meses, " meses e ", dias, " dias\n")
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 109; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */