package trabajoPracticoTDA;

public class PilaDinamica<T> implements Pila<T> {

	private NodoSimple<T> stack;

	public PilaDinamica() {
		this.stack = null;
	}

	@Override
	public boolean push(T dato) {
		NodoSimple<T> nuevoNodo = new NodoSimple<T>(dato);
		nuevoNodo.setSiguiente(this.getStack());
		this.setStack(nuevoNodo);
		return true;
	}

		@Override
	public T pop() {
		if(this.getStack() == null)
			return null;
		T informacion = this.getStack().getInformacion();
		this.setStack(this.getStack().getSiguiente());
		return informacion;
	}

	@Override
	public T peek() {
		return this.getStack().getInformacion();
	}

	@Override
	public boolean isEmpty() {
		return this.getStack() == null;
	}

	@Override
	public void empty() {
		while(this.stack!=null)
			this.setStack(this.getStack().getSiguiente());
	}

	public NodoSimple<T> getStack() {
		return this.getStack();
	}

	public void setStack(NodoSimple<T> nodo) {
		this.setStack(nodo);
	}



}
