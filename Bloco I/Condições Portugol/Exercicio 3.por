programa
{
	inclua biblioteca Matematica --> mat
	
	funcao inicio()
	{
		real vetor[4],a

		para (inteiro posicao = 0; posicao < 4; posicao++)
		{
			escreva("Digite um valor: ")
			leia(a)
			a = mat.potencia(a,2.0)
			vetor[posicao] = a
		}
		escreva ("\nOs valores ao quadrado é(são): ")
		
		para(inteiro posicao = 0; posicao < 4; posicao++)
		{
			se(vetor[2] >= 1000)
			{
				escreva(vetor[2], " ")
				pare
			}
			senao se(vetor[2] <= 1000)
			{
				escreva(vetor[posicao], " ")
			}
		}
		escreva("\n")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 372; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */