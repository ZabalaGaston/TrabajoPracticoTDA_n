package trabajoPracticoTDA;

public class PilaCL<T> implements Pila<T>{

	private ListaSimple<T> lista;

	public PilaCL() {
		lista = new ListaSimple<T>();
	}

	@Override
	public boolean push(T dato) {
		return lista.pushBack(dato);
	}

	@Override
	public T pop() {
		return lista.popBack();
	}

	@Override
	public T peek() {
		return lista.searchAt(lista.size());
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
