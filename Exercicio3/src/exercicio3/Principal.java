//	3) Escreva um programa que simule o controle de uma pista de decolagem de aviões
//	em um aeroporto. Neste programa, o usuário deve ser capaz de realizar as
//	seguintes tarefas: a) Listar o número de aviões aguardando na fila de decolagem; b)
//	Autorizar a decolagem do primeiro avião da fila; c) Adicionar um avião à fila de
//	espera; d) Listar todos os aviões na fila de espera; e) Listar as características do
//	primeiro avião da fila. Considere que os aviões possuem um nome e um número
//	inteiro como identificador.

package exercicio3;

public class Principal {

	public static void main(String[] args) {

		Fila fila = new Fila();

		Aviao a = new Aviao();
		Aviao b = new Aviao();
		Aviao c = new Aviao();
		Aviao d = new Aviao();

		a.nome = "AIRBUS A330";
		a.numero = 1;

		b.nome = "BAC ONE-ELEVEN";
		b.numero = 15;

		c.nome = "BOEING 747-8";
		c.numero = 29;

		d.nome = "BOEING 777";
		d.numero = 5;

		fila.insere(a);
		fila.insere(c);
		fila.insere(d);

		int numAvioes = fila.avioes.size();
		System.out.println("Número de aviões = " + numAvioes);
		fila.imprimir();

		System.out.println("Autorizado a decolagem do primeiro avião");
		fila.remove();
		fila.imprimir();

		System.out.println("Avião adicionado a lista de espera");
		fila.insere(b);

		fila.imprimir();

		fila.primeiro();

	}

}
