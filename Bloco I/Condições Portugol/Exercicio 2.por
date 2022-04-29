programa
{
	
	funcao inicio()
	{
		inteiro C, N, salary, extraTime, pagamento, coringa
		
		escreva("Escreva seu código de funcionário: ")
		leia(C)
		escreva("\nEscreva suas horas trabalhadas: ")
		leia(N)

		se (N > 50)
		{
			extraTime = N - 50
			N = N - extraTime
			extraTime = extraTime * 20
			N = N * 10
			escreva("Você receberá um total de: ", N + extraTime,"\n")
		}
		senao
		{
			N = N*10
			escreva("Você receberá um total de: ",N)
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 450; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */