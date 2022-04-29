programa
{
	
	funcao inicio()
	{
		real a,b,c,d,newE,f
		real x, y
		escreva("Digite um valor para A: ")
		leia(a)
		escreva("Digite um valor para B: ")
		leia(b)
		escreva("Digite um valor para C: ")
		leia(c)
		escreva("Digite um valor para D: ")
		leia(d)
		escreva("Digite um valor para E: ")
		leia(newE)
		escreva("Digite um valor para F: ")
		leia(f)
		
		x = ((c*newE)-(b*f))/((a*newE)-(b*d))
		y = ((a*f)-(c*d))/((a*newE)-(b*d))
		escreva("O valor de X é: ", x, "\n", "O valor de Y é: ", y)
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 505; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */