package trabajoPracticoTDA;

@SuppressWarnings("rawtypes")
public class ColaCL implements Cola {

	private Lista lista;
	
	public ColaCL() {
		lista = new Lista();
	}
	
	@Override
	public boolean offer(Object dato) {
		return lista.pushBack(dato);
	}

	@Override
	public Object poll() {
		return lista.popFront();
	}

	@Override
	public Object peek() {
		Object dato = lista.searchAt(1);
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
