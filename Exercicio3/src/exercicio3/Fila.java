package exercicio3;

import java.util.ArrayDeque;
import java.util.Queue;

public class Fila {

	private final Queue<Aviao> avioes = new ArrayDeque<>();

	void insere(Aviao A) {
		this.avioes.add(A);
	}
	
	void primeiro() {
		Aviao aviao = this.avioes.peek();
		if (aviao == null) {
			System.out.println("A fila está vazia.");
			return;
		}
		System.out.println(aviao);
	}

	Aviao remove() {
		return this.avioes.poll();
	}

	boolean filaVazia() {
		return (this.avioes.isEmpty());
	}

	int tamanho() {
		return this.avioes.size();
	}

	void imprimir() {
			System.out.println(avioes);
	}
	


}
