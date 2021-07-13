package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Colecoes {

	public static void main(String[] args) {
		
		// criacao de collection do tipo LIST - criacao de objeto minhaLIsta para iniciar com arrayList
		List<Integer> minhaLista = new ArrayList<Integer>();
		
		minhaLista.add(2); // add serve para adicionar um valor na possicao do arrayList
		minhaLista.add(1);
		minhaLista.add(3);
		minhaLista.add(7);
		minhaLista.add(4);
		
		
		for (Integer lista:minhaLista) {
			System.out.println(lista);
		}
		
		System.out.println("\nRemovendo um elemento da lista");
		
		minhaLista.remove(0); // remove um elemento da minhaLista
		
		for (Integer lista:minhaLista) {
			System.out.println(lista);
		}
		
		int primeiroElemento = minhaLista.get(0); // pega o elemento declarado no arrayLista
		System.out.println("\nO primeiro elemento é: " + primeiroElemento);
		System.out.println(); // limpa cache de memoria --> profexo gosta de fazer mais nao é necessário
		
		
		for(int i=0; i<minhaLista.size(); i++) { // size mostra o tamanho do array
			System.out.println("\nElemento: " + minhaLista.get(i));
		}
		
		Collections.sort(minhaLista); // metodo sort vai rdenar minha lista
		System.out.println("\nDepois de ordenado...");
		System.out.println(minhaLista);
		
		System.out.println();
		
		Set<Integer> meuSet = new HashSet<Integer>();// criacao do Set a partir do metodo Set // Set nao deixa dados repetidos
		
		meuSet.add(1);
		meuSet.add(6);
		meuSet.add(1);
		meuSet.add(4);
		meuSet.add(7); // adicionando elemento para o meu HashSet
		
		Iterator<Integer> iMeuSet = meuSet.iterator();// criaçao de uma nova interface chamada interator
		
		
		while(iMeuSet.hasNext()) {//percorrer toda hashSet
			System.out.println(iMeuSet.next()); // imprimir cada possicao indicando sempre a proxima a partir do metodo next
		}
		

	}

}
