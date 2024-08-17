package sorteioList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class NumeroSorte {

	private List<Integer> listaNumeros;
	
	private int numero;
	Random random = new Random();

	public NumeroSorte(int quantidade, int limite) {
		Set<Integer> numeros = new LinkedHashSet<>();
		
		//gerando os números
		for (int i = 0; i < quantidade; i++ ) {
			numero = random.nextInt(limite) + 1;
		}
		//Garante que os numeros não sejam repetidos 
		while (!numeros.add(numero)) {
			numero = random.nextInt(limite) +1;
		}
		// inicializa a lista com os números únicos
		listaNumeros = new ArrayList<>(numeros);
		Collections.shuffle(listaNumeros);
	}
	
	public int sortear() {
		return listaNumeros.get(random.nextInt(listaNumeros.size()));
	}
	
	public List<Integer> getListaNumeros() {
		return listaNumeros;
	}
	
	public int getNumero() {
		return numero;
	}
	
}
