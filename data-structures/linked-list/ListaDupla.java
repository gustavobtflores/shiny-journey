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
		if(ref != null) {
			for(No aux = this.ref; aux != null; aux = aux.getProx()) {
				if(aux.getInfo() >= info) {
					No novo = new No(info, ref);
					aux.setAnter(novo);
					ref = novo;
					break;
				}
				
				if(aux.getInfo() <= info) {
					if(aux.getProx() == null) {
						No novo = new No(info, null, aux);
						aux.setProx(novo);
						break;
					}
					
					if(aux.getProx().getInfo() >= info) {
						No novo = new No(info, aux.getProx(), aux);
						aux.getProx().setAnter(novo);
						aux.setProx(novo);
						break;
					}
				}
			}
			
			return;
		}
		
		No novo = new No(info);
		ref = novo;
	}
	
	public void remove(int info) {
		if(ref == null) {
			System.out.println("Não é possível remover de uma lista vazia");
			return;
		}
		
		if(ref.getInfo() == info && ref.getProx() == null) {
			ref = null;
		}
		
		for(No aux = this.ref; aux != null; aux = aux.getProx()) {
			if(aux.getInfo() == info) {
				if(aux.getAnter() != null) {
					aux.getAnter().setProx(aux.getProx());
				} else {
					ref = aux.getProx();
				}
				
				if(aux.getProx() != null) {
					aux.getProx().setAnter(aux.getAnter());
				}
			}
			
			if(aux.getProx() != null && aux.getProx().getInfo() > info) {
				break;
			}
		}
	}
	
	public boolean listaVazia() {
		return ref == null;
	}
}