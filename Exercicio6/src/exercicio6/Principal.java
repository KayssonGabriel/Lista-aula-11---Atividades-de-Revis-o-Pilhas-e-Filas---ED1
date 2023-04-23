//	6) Sorteie 2000 números, sendo 1000 positivos e 1000 negativos e coloque numa fila.
//	Cada vez que o número positivo estiver no início da fila, este deve ser retirado da fila
//	e empilhado numa pilha. Cada vez que um número negativo estiver no início da fila,
//	o número que estiver no topo da pilha deve ser impresso e retirado.

package exercicio6;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;
import java.util.Stack;

public class Principal {

	public static void main(String[] args) {
		Queue<Integer> fila = new LinkedList<Integer>();
		Stack<Integer> pilha = new Stack<Integer>();

		Random rand = new Random();

		for (int i = 0; i < 2000; i++) {
			int num = rand.nextInt(2001) - 1000;
			fila.add(num);
		}
		

		int tamanhoFila = fila.size();

		for (int i = 0; i < tamanhoFila; i++) {
			if (fila.peek() >= 0) {
				pilha.push(fila.poll());
			} else {
				if (!pilha.isEmpty()) {
					System.out.println(pilha.pop());
//					pilha.pop();
					break;

				}else {
					System.out.println("A fila começou com um número negativo. Portanto não é possivel retirar o topo da Pilha, pois ela ainda esta vazia!!!");
					break;
				}

			}
		}

	}

}
