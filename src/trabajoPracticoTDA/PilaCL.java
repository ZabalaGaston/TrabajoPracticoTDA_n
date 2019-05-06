package trabajoPracticoTDA;

public class PilaCL implements Pila{

	private Lista lista;

	public PilaCL() {
		lista = new Lista();
	}

	@Override
	public boolean push(Object dato) {
		return lista.pushBack(dato);
	}

	@Override
	public Object pop() {
		return lista.popBack();
	}

	@Override
	public Object peek() {
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
