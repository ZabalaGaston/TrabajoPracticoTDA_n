package trabajoPracticoTDA;

public class ColaHLista extends ListaSimple implements Cola{

	public ColaHLista() {
		super();
	}

	@Override
	public boolean offer(Object dato) {
		return super.pushBack(dato);
	}

	@Override
	public Object poll() {
		return super.popFront();
	}

	@Override
	public Object peek() {
		Object dato = super.searchAt(1);
		return dato;
	}

	@Override
	public boolean isEmpty() {
		return super.isEmpty();
	}

	@Override
	public void empty() {
		super.empty();
	}
}
