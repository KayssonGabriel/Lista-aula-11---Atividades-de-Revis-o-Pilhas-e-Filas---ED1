//	4) Considere que existe uma fila F1 com 100 números aleatórios. Faça uma função que
//	inverta uma fila F1, criando-se uma nova fila F2.

package exercicio4;

import java.util.Random;

public class Principal {
	public static void main(String[] args) {

		Fila fila = new Fila();
		Random rand = new Random();

		for (int i = 0; i < 100; i++) {
			int num = rand.nextInt(100) + 1;
			fila.fila1.add(num);
		}

		System.out.println("F1 = " + fila.fila1);

		fila.inverter();

		System.out.println("F2 = " + fila.fila2);

	}
}
