programa
{
	//inclua biblioteca Util --> util
	
	funcao inicio()
	{
		real somatoria = 0.0, valorLido = 1.0
		inteiro qntLido = 0
		
		enquanto(valorLido > 0)
		{
			escreva("Digite um valor para a somatória: ")
			leia(valorLido) //util.sorteia(0, 15)
			se(valorLido > 0)
			{
				somatoria += valorLido
				qntLido += 1
			}			
		}
		escreva("\nO total da somatória é de: ", somatoria)
		escreva("\nA média é de: ", somatoria/qntLido)
		escreva("\nForam lidos um total de: ", qntLido, " valores")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 279; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {somatoria, 7, 7, 9}-{valorLido, 7, 24, 9}-{qntLido, 8, 10, 7};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */