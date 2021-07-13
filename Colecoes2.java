package Collections;

import java.util.ArrayList;
import java.util.Scanner;

public class Colecoes2 {

	public static void main(String[] args) {
		
		int op;
		Scanner leia = new Scanner(System.in);
		
		ArrayList<String> estoque = new ArrayList();
		
		
		do {
			System.out.println("\n(1) Deseja adicionar produtos ao estoque? "
					+ "\n(2) Deseja remover algum produto? "
					+ "\n(3) Atualizar \n(4) Mostrar produtos \n(0) Encerrar o programa"  );
			
			System.out.println("\n*********************************");
			System.out.println("\n\t\tDigite sua opção ");
			System.out.println("\n*********************************");
			op = leia.nextInt();
			
			switch(op) {
			
				
			case 1:
				leia.nextLine();
				System.out.println("\nDigite o produto para adicionar ao estoque: ");
				String produto = leia.nextLine(); // vai ler uma variavel
				estoque.add(produto); //adiciona produto na arrayList
				System.out.println(estoque);
				break;
				
			case 2:
				leia.nextLine();
				System.out.println("\nDigite o produto para remover do estoque: "); // usuario coloca produto
				String produto1 = leia.nextLine(); // adiciona na variavel produto1
				if(estoque.contains(produto1)) { //verificacao se contem esse produto
					estoque.remove(produto1); // se tiver ele é removido com o remove
				}
				else {
					System.out.println("\nProduto não existe no estoque!");
				}
				System.out.println(estoque);
				break;
			case 3:
				leia.nextLine();
				System.out.println("\nDigite o produto que quer atualizar: ");
				String verifica = leia.nextLine();
				System.out.println("\nDitie o nome do produto que entrara no lugar de: " + verifica  + ": ");
				String novo = leia.nextLine();
				
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
