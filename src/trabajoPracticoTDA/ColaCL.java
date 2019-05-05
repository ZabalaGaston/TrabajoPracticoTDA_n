package trabajoPracticoTDA;

public class ColaCL implements Cola {

	private Lista lista;
	
	@Override
	public boolean offer(Object dato) {
		return lista.pushBack(dato);
	}

	@Override
	public Object poll() {
		Object dato = lista.searchAt(0);
		lista.remove(dato);
		return dato;
	}

	@Override
	public Object peek() {
		Object dato = lista.searchAt(0);
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
