package trabajoPracticoTDA;


public class ColaDinamica<T> implements Cola<T>{

	private NodoSimple<T> inicio;
	private NodoSimple<T> fin;
	public ColaDinamica() {
		this.setInicio(null);
		this.setFin(null);
	}

	
	@Override
	public boolean offer(T dato) {
		NodoSimple<T> nuevoNodo = new NodoSimple<T>(dato);
		if(this.getInicio() == null)
			this.setInicio(nuevoNodo);
		else
			this.getFin().setSiguiente(nuevoNodo);
		this.setFin(nuevoNodo);
		return true;
	}

	@Override
	public T poll() {
		if(this.getInicio() == null)
			return null;
		NodoSimple<T> nodoEliminar = this.getInicio();
		this.setInicio(nodoEliminar.getSiguiente());
		return nodoEliminar.getInformacion();
	}

	@Override
	public T peek() {
		return this.getInicio().getInformacion();
	}

	@Override
	public boolean isEmpty() {
		return this.getInicio() == null;
	}

	@Override
	public void empty() {
		while(this.getInicio()!=null)
			this.setInicio( this.getInicio().getSiguiente());		
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
