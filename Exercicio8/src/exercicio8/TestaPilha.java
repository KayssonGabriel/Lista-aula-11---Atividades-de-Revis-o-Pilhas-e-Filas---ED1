package exercicio8;

import java.util.Random;
import java.util.Stack;

public class TestaPilha {
	Stack<Integer> N = new Stack<Integer>();
	Stack<Integer> P = new Stack<Integer>();

	Random rand = new Random();

	public void testar() {
		for (int i = 0; i < 1000; i++) {
			int num = rand.nextInt(201) - 100;
			if (num > 0) {
				P.add(num);
			} else if (num < 0) {
				N.add(num);
			} else {
				if (!N.isEmpty() && !P.isEmpty()) {
					System.out.println(P.pop());
					System.out.println(N.pop());
				} else {
					System.out.println("O número começou com 0!!! Erro pois não há como retirar de pilhas vazias");
					break;
				}
			}

		}
	}

}
