package trabajoPracticoTDA;


public class Lista<T> {

	private NodoDoble<T> actual;	

	public Lista() {
		this.setActual(null);
	}

	public boolean pushBack(T dato) {
		NodoDoble<T> nodoNuevo = new NodoDoble<T>();
		while(this.getActual()!=null && this.getActual().getSiguiente()!=null)
			this.setActual(this.getActual().getSiguiente());
		if(this.getActual()!=null)
		{
			this.getActual().setSiguiente(nodoNuevo);
			nodoNuevo.setAnterior(this.getActual());
		}
		this.setActual(nodoNuevo);
		return true;	
	}
	
	public T popBack() {
		if(this.getActual() == null)
			return null;
		while(this.getActual().getSiguiente()!=null)
			this.setActual(this.getActual().getSiguiente());
		NodoDoble<T> nodoEliminar = this.getActual();
		if(this.getActual().getAnterior() != null)
			this.getActual().getAnterior().setSiguiente(null);
		else
			this.setActual(null);
		return nodoEliminar.getInformacion();		
	}
	
	public boolean pushFront(T dato) {
		
		return true;
	}
	
	public T popFront() {
		
		return null;
	}
	
	public boolean remove(T dato) {
		return true;
	}
	
	public void reverse() {
		 
	}
	
	public boolean insertarAt(int posicion, T dato) {

		return true;
	}
	
	public boolean eraseAt(int posicion) {
		return true;
	}
	
	public boolean isEmpty() {
		return true;
	}
	
	public void empty() {
		
	}
	
	public T search(Object dato) {
		return null;
	}
	
	public T searchAt(int posicion) {	
		return null;
	}
	
	public int size() {
		return 1;
	}

	public NodoDoble<T> getActual() {
		return actual;
	}

	public void setActual(NodoDoble<T> actual) {
		this.actual = actual;
	}
}
