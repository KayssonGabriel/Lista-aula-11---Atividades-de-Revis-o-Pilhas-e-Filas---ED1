//	2) Utilizando somente operações de empilhar e desempilhar, escreva um programa que
//	remove um item com chave c fornecida pelo usuário da pilha. Ao final da execução
//	da função, a pilha deve ser igual à original, exceto pela ausência do item removido.

package exercicio2;

import java.util.Scanner;
import java.util.Stack;

public class RemoveItem {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Stack<Integer> pilha1 = new Stack<>();
		Stack<Integer> pilha2 = new Stack<>();

		System.out.println("Digite números inteiros positivos. Para finalizar digite -1");
		while (true) {
			int num = sc.nextInt();
			if (num == -1) {
				break;
			}

			pilha1.push(num);
		}

		System.out.println("Digite a chave para ser removido: ");
		int chave = sc.nextInt();

		int tamalhoP1 = pilha1.size();

		for (int j = 0; j < tamalhoP1; j++) {
			if (pilha1.peek() == chave) {
				pilha1.pop();
			} else {
				pilha2.push(pilha1.pop());
			}
		}

		int tamalhoP2 = pilha2.size();

		for (int i = 0; i < tamalhoP2; i++) {
			pilha1.push(pilha2.peek());
			pilha2.pop();
		}

		System.out.println(pilha1);

		sc.close();
	}
}
