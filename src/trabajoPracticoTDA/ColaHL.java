package trabajoPracticoTDA;

public class ColaHL<T> extends ListaSimple<T> implements Cola<T>{

	public ColaHL() {
		super();
	}

	@Override
	public boolean offer(T dato) {
		return super.pushBack(dato);
	}

	@Override
	public T poll() {
		return super.popFront();
	}

	@Override
	public T peek() {
		T dato = super.searchAt(1);
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
