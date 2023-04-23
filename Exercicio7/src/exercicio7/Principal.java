//	7) Escreva um método para inverter a ordem dos elementos de uma fila de 20 posições
//	de inteiros, usando uma pilha como estrutura auxiliar.

package exercicio7;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Auxiliar auxiliar = new Auxiliar();

		System.out.println("Digite 20 números: ");

		for (int i = 0; i < 20; i++) {
			int num = sc.nextInt();
			auxiliar.fila.add(num);
		}

		auxiliar.inverter();

		System.out.println(auxiliar.fila);

		sc.close();

	}

}
