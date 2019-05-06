package trabajoPracticoTDA;

public class PilaHL extends Lista implements Pila{

	public PilaHL() {
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
