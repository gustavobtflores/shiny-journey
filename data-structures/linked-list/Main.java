public class Main {

	public static void main(String[] args) {
		ListaDupla lista = new ListaDupla();

		// Inserções
		System.out.println("Inserção na lista em ordem crescente:");
		lista.insere(9);
		lista.insere(3);
		lista.insere(1);
		lista.insere(4);
		lista.insere(4);
		lista.insere(2);
		lista.insere(5);
		lista.insere(3);
		lista.imprime();

		// Remoção do início
		System.out.println("\nRemoção do início da lista (número 1 removido):");
		lista.remove(1);
		lista.imprime();

		// Remoção do final
		System.out.println("\nRemoção do final (número 9 removido):");
		lista.remove(9);
		lista.imprime();

		// Remoção do meio
		System.out.println("\nRemoção do meio (número 3 removido):");
		lista.remove(3);
		lista.imprime();

		// Remoção de elementos que possuem cópias
		System.out.println("\nRemoção de elementos que possuem cópias (número 4 removido):");
		lista.remove(4);
		lista.imprime();

		// Remoção de elementos inexistentes
		System.out.println("\nRemoção de elementos inexistentes (tentando remover número 10):");
		lista.remove(10);
		lista.imprime();

		// Imprimir lista vazia
		System.out.println("\nImprimir lista vazia (removidos números restantes 2 e 5):");
		lista.remove(2);
		lista.remove(5);
		lista.imprime();

		// Esvaziar lista e voltar a preenchê-la
		System.out.println("\nVoltando a preencher a lista depois de esvaziar:");
		lista.insere(8);
		lista.insere(9);
		lista.insere(6);
		lista.imprime();
	}
}
