package Collections;

public class Excecao {

	public static void main(String[] args) {
		
		
		String frase = null, novaFrase = null;
		
		try {
			novaFrase = frase.toUpperCase();
		}
		catch(NullPointerException e){//captura da possivel excecao
			
			//trtamento da excecao
			System.out.println("\nA frase inicial esta nula, para solucionar"
					+ " tal problema, foi atribuido um valor default...");
			
			frase = "Frase vazia";
			novaFrase = frase.toUpperCase();
			
		}
		
		System.out.println("\nFrase antiga: " + frase);
		System.out.println("\nFrase nova: " + novaFrase);
	}

}
