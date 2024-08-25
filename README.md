# DESAFIO BOOTCAMP JAVA DIO-CLARO 2024

O sistema dever� receber dois par�metros via terminal que representar�o dois n�meros inteiros, com estes dois n�meros voc� dever� obter a quantidade de intera��es (for) e realizar a impress�o no console (System.out.print) dos n�meros incrementados, exemplo:

Se voc� passar os n�meros 12 e 30, logo teremos uma intera��o (for) com 18 ocorr�ncias para imprimir os n�meros, exemplo: "Imprimindo o n�mero 1", "Imprimindo o n�mero 2" e assim por diante.

Se o primeiro par�metro for MAIOR que o segundo par�metro, voc� dever� lan�ar a exce��o customizada chamada de ParametrosInvalidosException com a segunda mensagem: "O segundo par�metro deve ser maior que o primeiro"

Crie o projeto DesafioControleFluxo

Dentro do projeto, crie a classe Contador.java para realizar toda a codifica��o do nosso programa.

Dentro do projeto, crie a classe ParametrosInvalidosException que representar� a exce��o de neg�cio no sistema.

Abaixo temos um trecho de c�digo no qual voc� poder� seguir alterando as partes que contenham ??

```
public class Contador {
	public static void main(String[] args) {
		Scanner terminal = new Scanner(System.in);
		System.out.println("Digite o primeiro par�metro");
		int parametroUm = terminal.??;
		System.out.println("Digite o segundo par�metro");
		int parametroDois = terminal.??;
		
		try {
			//chamando o m�todo contendo a l�gica de contagem
			contar(parametroUm, parametroDois);
		
		}catch (? exception) {
			//imprimir a mensagem: O segundo par�metro deve ser maior que o primeiro
		}
		
	}
	static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
		//validar se parametroUm � MAIOR que parametroDois e lan�ar a exce��o
		
		int contagem = parametroDois - parametroUm;
		//realizar o for para imprimir os n�meros com base na vari�vel contagem
	}
}
```