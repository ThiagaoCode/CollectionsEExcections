package Collections;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception2 {
	
	//demonstar o lancamento de uma excecao quando ocore uma divisao por 0
	
	public static int quociente(int numerador, int denominador) throws ArithmeticException{
		return numerador / denominador;
	}

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		boolean continuaLoop = true; //determina se mais entradas são necessarias
		
		do {
			try { //ler dois numeros e calcular o quociente, fazendo a verificacao
				System.out.println("\nEntre com o numerador: ");
				int numerador = leia.nextInt();
				System.out.println("\nEntre com o denominador: ");
				int denominador = leia.nextInt();
				
				int resultado = quociente(numerador, denominador); //quociente = resultado de uma divisao
				System.out.printf("\nResultado: %d / %d = %d\n", numerador, denominador, resultado);
				continuaLoop = false;
			}
			catch(InputMismatchException inputMismatchException) { // escessao de entraa de dados // verifica um erro
				System.err.printf("\nException: %s\n ", inputMismatchException);
				leia.nextLine();
				System.out.println("\nEntre com um valor do tipo inteiro. Por favor, tente novamente.\n");
			} 
			catch(ArithmeticException arithmeticException) {
				System.err.printf("\nException: %s\n ", arithmeticException);
				System.out.println("\nZero é um denominador inválido. Por favor, tente novamente. \n");
			}
		}
		while(continuaLoop);

	}

}
