package exercicio3;

import java.util.ArrayList;
import java.util.List;

public class Fila {

	List<Aviao> avioes = new ArrayList<>();

	void insere(Aviao A) {
		this.avioes.add(A);
	}
	
	void primeiro() {
		System.out.println(this.avioes.get(0));
	}

	Aviao remove() {
		return (this.avioes.remove(0));
	}

	boolean filaVazia() {
		return (this.avioes.isEmpty());
	}

	void imprimir() {
			System.out.println(avioes);
	}
	


}
