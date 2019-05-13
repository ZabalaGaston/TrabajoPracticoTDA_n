package trabajoPracticoTDA;

public class PilaCLista implements Pila{

	private ListaSimple lista;

	public PilaCLista() {
		lista = new ListaSimple();
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
