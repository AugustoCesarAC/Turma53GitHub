programa
{
	
	funcao inicio()
	{
		real custoFabric, dist, imposto
		escreva("Digite o valor do carro (custo de fábrica): ")
		leia(custoFabric)
		dist = (custoFabric/100)*28
		imposto = (custoFabric/100)*45
		escreva("O custo do consumidor é: ", custoFabric+dist+imposto)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 277; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */