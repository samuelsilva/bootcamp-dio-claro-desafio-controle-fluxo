import java.util.Scanner;

public class Contador {

    public static void main(String[] args) {
        // Cria��o do objeto Scanner para capturar a entrada do usu�rio via terminal
        Scanner terminal = new Scanner(System.in);

        System.out.println("Digite o primeiro par�metro");
        int parametroUm = terminal.nextInt();

        System.out.println("Digite o segundo par�metro");
        int parametroDois = terminal.nextInt();

        try {
            // Chamando o m�todo contendo a l�gica de contagem
            contar(parametroUm, parametroDois);
        } catch (ParametrosInvalidosException e) {
            // Imprimir a mensagem: O segundo par�metro deve ser maior que o primeiro
            System.out.println(e.getMessage());
        }

        // Fechar o scanner
        terminal.close();
    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        // Validar se parametroUm � MAIOR que parametroDois e lan�ar a exce��o
        if (parametroUm > parametroDois) {
            throw new ParametrosInvalidosException("O segundo par�metro deve ser maior que o primeiro");
        }

        // Calcular a quantidade de n�meros a serem impressos
        int contagem = parametroDois - parametroUm;

        // Realizar o for para imprimir os n�meros com base na vari�vel contagem
        for (int i = 1; i <= contagem; i++) {
            System.out.println("Imprimindo o n�mero " + i);
        }
    }
}
