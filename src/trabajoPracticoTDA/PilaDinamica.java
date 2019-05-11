package trabajoPracticoTDA;

public class PilaDinamica<T> implements Pila<T> {

	private NodoSimple<T> stack;

	public PilaDinamica() {
		this.stack = null;
	}

	@Override
	public boolean push(T dato) {
		NodoSimple<T> nuevoNodo = new NodoSimple<T>(dato);
		nuevoNodo.setSiguiente(this.stack);
		this.setStack(nuevoNodo);
		return true;
	}

		@Override
	public T pop() {
		if(this.stack == null)
			return null;
		T informacion = stack.getInformacion();
		this.stack = this.stack.getSiguiente();
		return informacion;
	}

	@Override
	public T peek() {
		return this.stack.getInformacion();
	}

	@Override
	public boolean isEmpty() {
		return this.stack == null;
	}

	@Override
	public void empty() {
		while(this.stack!=null)
			this.stack = this.stack.getSiguiente();
	}

	public NodoSimple<T> getStack() {
		return this.stack;
	}

	public void setStack(NodoSimple<T> nodo) {
		this.stack = nodo;
	}



}
