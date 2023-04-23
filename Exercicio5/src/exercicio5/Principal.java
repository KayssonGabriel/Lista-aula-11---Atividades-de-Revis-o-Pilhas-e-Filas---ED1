//	5) Dado uma Fila de números distintos F e uma Pilha P. Sorteie 1000 números
//	aleatórios e insira na fila F. Caso o número já esteja presente na Fila F, o número
//	deve ser inserido na Pilha P. Após sortear os 1000 números, imprimir a Fila F e a
//	Pilha P.

package exercicio5;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;
import java.util.Stack;

public class Principal {
	public static void main(String[] args) {

		Queue<Integer> F = new LinkedList<Integer>();
		Stack<Integer> P = new Stack<Integer>();

		Random rand = new Random();

		for (int i = 0; i < 1000; i++) {
			int num = rand.nextInt(1000) + 1;
			if (F.contains(num)) {
				P.push(num);
			} else {
				F.add(num);
			}
		}

		System.out.println("Fila F: " + F.toString());
		System.out.println("Pilha P: " + P.toString());
	}
}
