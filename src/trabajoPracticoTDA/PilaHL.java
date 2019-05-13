package trabajoPracticoTDA;

@SuppressWarnings("rawtypes")
public class PilaHL<T> extends ListaSimple<T> implements Pila<T>{

	public PilaHL() {
		super();
	}

	@Override
	public boolean push(T dato) {
		return super.pushBack(dato);
	}

	@Override
	public T pop() {
		return super.popBack();
	}

	@Override
	public T peek() {
		return super.searchAt(super.size());
	}	
}
