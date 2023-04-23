package exercicio7;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Auxiliar {
	Queue<Integer> fila = new LinkedList<Integer>();
	Stack<Integer> pilha = new Stack<Integer>();

	public void inverter() {
		int tamanhoFila = fila.size();

		for (int i = 0; i < tamanhoFila; i++) {
			pilha.push(fila.poll());
		}

		int tamanhoPilha = pilha.size();

		for (int i = 0; i < tamanhoPilha; i++) {
			fila.add(pilha.pop());
		}

	}

}
