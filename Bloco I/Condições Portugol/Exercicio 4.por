programa
{
	
	funcao inicio()
	{
		inteiro a
		
		escreva("Digite um número inteiro: ")
		leia(a)
		se(a==0)
		{
			escreva("\nEsse número é neutro")
		}
		senao
		{
			se(a%2 == 0)
			{
				escreva("\nEsse número é par")
			}
			senao
			{
				escreva("\nEsse número é impar")
			}
			se(a>0)
			{
				escreva("\nEsse número é positivo")
			}
			senao
			{
				escreva("\nEsse número é negativo")
			}
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 419; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */