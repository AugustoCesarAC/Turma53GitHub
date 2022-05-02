programa
{
	//inclua biblioteca Util --> util
	inclua biblioteca Matematica --> mat
	
	funcao inicio()
	{
		real salary, children, salaryBigger = 0.0, salaryCem = 0.0, mediaChildren = 0.0, mediaSalary = 0.0
		
		para(inteiro contador = 1; contador <= 20; contador ++)
		{
			escreva("\nQual é o seu salário? ")
			leia(salary)
			//salary = util.sorteia(50, 200)  Teste usando numeros aleatorios
						
			escreva("\nQuantos filhos você possui? ")
			leia(children)
			//children = util.sorteia(0, 5)  Teste usando numeros aleatorios
			
			se (salary > salaryBigger) {salaryBigger = salary}
			
			mediaChildren += children
			mediaSalary += salary

			se (salary <= 100) {salaryCem += 1}
		}

		escreva("Média do salário da população é: ", mat.arredondar(mediaSalary/20, 2))
		escreva("\nMédia do número de filhos é: ", mat.arredondar(mediaChildren/20,2))
		escreva("\nO maior salário é de: ", salaryBigger)
		escreva("\nO percentual de pessoas com salário até R$100,00 é de: ", salaryCem*100/20, "%\n")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 689; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */