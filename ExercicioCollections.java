package Collections;

import java.util.ArrayList;
import java.util.Scanner;

public class ExercicioCollections {

	public static void main(String[] args) {
		
		int op;
		Scanner l = new Scanner(System.in);
		
		ArrayList<String> estoque = new ArrayList();
		
		
		do {
			System.out.println("\n(1) Adicionar produtos ao estoque? "
					+ "\n(2) Remover algum produto? "
					+ "\n(3) Atualizar produtos (troca) "
					+ "\n(4) Mostrar produtos "
					+ "\n(0) Encerrar o programa"  );
			
			System.out.println("\n*********************************");
			System.out.println("\n\t\tDigite sua opção ");
			System.out.println("\n*********************************");
			op = l.nextInt();
			
			switch(op) {
			
				
			case 1:
				l.nextLine();
				System.out.println("\nDigite o produto para adicionar ao estoque: ");
				String produto = l.nextLine();
				estoque.add(produto); 
				System.out.println(estoque);
				break;
				
			case 2:
				l.nextLine();
				System.out.println("\nDigite o produto para remover do estoque: "); 
				String produto1 = l.nextLine(); 
				if(estoque.contains(produto1)) {
					estoque.remove(produto1);
				}
				else {
					System.out.println("\nProduto não existe no estoque!");
				}
				System.out.println(estoque);
				break;
			case 3:
				l.nextLine();
				System.out.println("\nDigite o produto que quer atualizar: ");
				String verifica = l.nextLine();
				System.out.println("\nDitie o nome do produto que entrara no lugar de: " + verifica  + ": ");
				String novo = l.nextLine();
				
				if(estoque.contains(verifica)) {
					estoque.remove(verifica);
					estoque.add(novo);
				}
				else {
					System.out.println("\nProduto não existente...");
				}
				
				System.out.println(estoque);
				break;
			case 4: 
				System.out.println("\nOs produtos do estoque são: ");
				System.out.println(estoque);
				break;
			
				default:
					System.out.println("\nVolte sempre!!");
			
			}
		}
		while(op!=0);
		System.out.println("\nAté a próxima!!");
		
		
		

	}

}
