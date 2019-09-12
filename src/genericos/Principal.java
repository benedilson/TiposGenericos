package genericos;

import java.util.ArrayList;
import java.util.List;

public class Principal {
	public static void main(String[] args) {
		Cesta<Fruta> frutas = new Cesta<>();
		
		frutas.adiciona(new Fruta("Tangerina"));
		frutas.adiciona(new Fruta("Melancia"));
		frutas.adiciona(new Fruta("Laranja"));
		frutas.adiciona(new Fruta("Uva"));
		frutas.adiciona(new FrutaVermelha("Morango"));
		
		List<FrutaVermelha> vermelhas = new ArrayList<>();
		vermelhas.add(new FrutaVermelha("Amora"));
		vermelhas.add(new FrutaVermelha("Cereja"));
		
		frutas.adicionaTodos(vermelhas);
		
		while(frutas.temItens()) {
			System.out.println(frutas.retira());
		}
	}
}
