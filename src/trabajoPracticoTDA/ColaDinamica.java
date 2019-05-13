package trabajoPracticoTDA;

public class ColaDinamica<T> implements Cola<T>{

	private NodoSimple<T> inicio;
	private NodoSimple<T> fin;
	
	public ColaDinamica() {
		this.inicio = null;
		this.fin = null;
	}

	@Override
	public boolean offer(T dato) {
		NodoSimple<T> nuevoNodo = new NodoSimple<T>(dato);
		if(this.inicio == null)
			this.inicio = nuevoNodo;
		else
			this.fin.setSiguiente(nuevoNodo);
		this.fin = nuevoNodo;
		return true;
	}

	@Override
	public T poll() {
		if(this.inicio == null)
			return null;
		NodoSimple<T> nodoEliminar = this.inicio;
		this.inicio = nodoEliminar.getSiguiente();
		return nodoEliminar.getInformacion();
	}

	@Override
	public T peek() {
		return this.inicio.getInformacion();
	}

	@Override
	public boolean isEmpty() {
		return this.inicio == null;
	}

	@Override
	public void empty() {
		while(this.inicio != null)
			this.inicio = this.inicio.getSiguiente();		
	}

	public NodoSimple<T> getInicio() {
		return inicio;
	}

	public void setInicio(NodoSimple<T> inicio) {
		this.inicio = inicio;
	}

	public NodoSimple<T> getFin() {
		return fin;
	}

	public void setFin(NodoSimple<T> fin) {
		this.fin = fin;
	}

}
