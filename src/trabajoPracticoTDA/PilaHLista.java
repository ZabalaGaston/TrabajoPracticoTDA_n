package trabajoPracticoTDA;

public class PilaHLista extends ListaSimple implements Pila{

	public PilaHLista() {
		super();
	}

	@Override
	public boolean push(Object dato) {
		return super.pushBack(dato);
	}

	@Override
	public Object pop() {
		return super.popBack();
	}

	@Override
	public Object peek() {
		return super.searchAt(super.size());
	}

	
}
