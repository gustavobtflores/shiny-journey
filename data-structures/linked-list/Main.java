public class Main {

	public static void main(String[] args) {
		ListaDupla lista = new ListaDupla();

		// Inserções
		System.out.println("Inserção na lista:");
		lista.insere(9);
		lista.insere(9);
		lista.insere(9);
		lista.insere(3);
		lista.insere(1);
		lista.insere(4);
		lista.insere(2);
		lista.insere(5);
		lista.insere(3);
		lista.imprime();

		// Remoção do início
		System.out.println("\nLista antes da remoção do número 1:");
		lista.imprime();

		System.out.println("\nLista após remoção do número 1:");
		lista.remove(1);
		lista.imprime();

		// Remoção do final
		System.out.println("\nRemoção do final:");
		lista.remove(5);
		lista.imprime();

		// Remoção do meio
		System.out.println("\nRemoção do meio:");
		lista.remove(3);
		lista.imprime();

		// Remoção de elementos que possuem cópias
		System.out.println("\nRemoção de elementos que possuem cópias:");
		lista.remove(9);
		lista.imprime();

		// Remoção de elementos inexistentes
		System.out.println("\nRemoção de elementos inexistentes:");
		lista.remove(10);
		lista.imprime();

		// Imprimir lista vazia
		System.out.println("\nImprimir lista vazia:");
		lista.remove(2);
		lista.remove(4);
		lista.imprime();

		// Esvaziar lista e voltar a preenchê-la
		System.out.println("\nVoltando a preencher a lista:");
		lista.insere(8);
		lista.insere(9);
		lista.insere(6);
		lista.imprime();
	}

}
