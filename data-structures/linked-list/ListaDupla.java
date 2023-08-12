public class ListaDupla {
	private No ref;

	public ListaDupla() {
		this.ref = null;
	}

	public void imprime() {
		if(this.ref == null) {
			System.out.println("Lista vazia");
			return;
		}

		No aux = ref;

		//Lista do início ao fim
		while(aux.getProx() != null) {
			System.out.print(aux.getInfo() + " ");
			aux = aux.getProx();
		}

		System.out.println(aux.getInfo());

		//Lista do fim ao início
		while(aux.getAnter() != null) {
			System.out.print(aux.getInfo() + " ");
			aux = aux.getAnter();
		}

		System.out.println(aux.getInfo());
	}

	public void insere(int info) {
		if (!listaVazia()) {
			for (No aux = this.ref; aux != null; aux = aux.getProx()) {
				No proximo = aux.getProx();

				// Verifica se o valor do elemento atual é maior ou igual ao valor a ser inserido
				if (aux.getInfo() >= info) {
					No novo = new No(info, ref);
					aux.setAnter(novo);
					ref = novo;
					break;
				} else {
					// Verifica se existe um próximo elemento, senão adiciona o argumento passado ao final da lista
					if (proximo == null) {
						No novo = new No(info, null, aux);
						aux.setProx(novo);
						break;
					}

					// Verifica se o próximo elemento tem valor maior ou igual ao valor a ser inserido
					if (proximo.getInfo() >= info) {
						No novo = new No(info, aux.getProx(), aux);
						proximo.setAnter(novo);
						aux.setProx(novo);
						break;
					}
				}
			}

			return;
		}

		// Se a lista estiver vazia, cria um novo nó com o valor a ser inserido e define como referência
		ref = new No(info);
	}


	public void remove(int info) {
		if (listaVazia()) {
			System.out.println("Não é possível remover de uma lista vazia");
			return;
		}

		// Verifica se o elemento a ser removido é o único da lista
		if (ref.getInfo() == info && ref.getProx() == null) {
			ref = null; // Remove o único elemento da lista
			return;
		}

		// Percorre a lista para encontrar o elemento a ser removido
		for (No atual = ref; atual != null; atual = atual.getProx()) {
			No anterior = atual.getAnter();
			No proximo = atual.getProx();

			// Verifica se o elemento atual é o que deve ser removido
			if (atual.getInfo() == info) {
				if (anterior != null) {
					anterior.setProx(proximo);
				} else {
					ref = proximo;
				}

				if (proximo != null) {
					proximo.setAnter(anterior);
				}
			}

			// Se o próximo elemento tem valor maior que o argumento passado, interrompe o loop
			if (proximo != null && proximo.getInfo() > info) {
				break;
			}
		}
	}

	public boolean listaVazia() {
		return ref == null;
	}
}