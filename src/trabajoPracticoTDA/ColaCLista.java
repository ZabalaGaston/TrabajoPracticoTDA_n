package trabajoPracticoTDA;

public class ColaCLista implements Cola {

	private ListaSimple lista;
	
	public ColaCLista(){
		lista = new ListaSimple();
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
