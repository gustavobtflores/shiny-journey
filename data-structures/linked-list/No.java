public class No {

	private int info;
	private No prox;
	private No anter;

	public No getAnter() {
		return anter;
	}

	public void setAnter(No anter) {
		this.anter = anter;
	}
	
	public No(int info) {
		this.info = info;
		this.prox = null;
		this.anter = null;
	}
	
	public No(int info, No prox) {
		this.info = info;
		this.prox = prox;
		this.anter = null;
	}

	public No(int info, No prox, No anter) {
		this.info = info;
		this.prox = prox;
		this.anter = anter;
	}

	public int getInfo() {
		return info;
	}

	public No getProx() {
		return prox;
	}

	public void setProx(No prox) {
		this.prox = prox;
	}
	
	@Override
	public String toString() {
		return "" + info;
	}
}
