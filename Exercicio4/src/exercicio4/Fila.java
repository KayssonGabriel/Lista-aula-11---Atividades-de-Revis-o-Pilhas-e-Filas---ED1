package exercicio4;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
	Queue<Integer> fila1 = new LinkedList<Integer>();
	Queue<Integer> fila2 = new LinkedList<Integer>();

	public void inverter() {
		int tamanhoFinal = fila1.size();
		for (int k = 0; k < tamanhoFinal; k++) {
			for (int i = 0; i < fila1.size() - 1; i++) {
				fila1.add(fila1.poll());
			}
			fila2.add(fila1.poll());
		}
	}

}
