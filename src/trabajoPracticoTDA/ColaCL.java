package trabajoPracticoTDA;

public class ColaCL<T> implements Cola<T> {

	private ListaSimple<T> lista;
	
	public ColaCL() {
		lista = new ListaSimple<T>();
	}
	
	@Override
	public boolean offer(T dato) {
		return lista.pushBack(dato);
	}

	@Override
	public T poll() {
		return lista.popFront();
	}

	@Override
	public T peek() {
		T dato = lista.searchAt(1);
		return dato;
	}

	@Override
	public boolean isEmpty() {
		return lista.isEmpty();
	}

	@Override
	public void empty() {
		lista.empty();
	}
}
