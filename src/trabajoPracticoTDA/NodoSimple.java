package trabajoPracticoTDA;

public class NodoSimple<T> {
	
	private T informacion;
	private NodoSimple<T> siguiente;

	public NodoSimple() {
		this.informacion = null;
		this.siguiente = null;
	}
	
	public NodoSimple(T informacion) {
		this.informacion = informacion;
		this.siguiente = null;
	}

	public T getInformacion() {
		return informacion;
	}

	public void setInformacion(T informacion) {
		this.informacion = informacion;
	}

	public NodoSimple<T> getSiguiente() {
		return siguiente;
	}

	public void setSiguiente(NodoSimple<T> siguiente) {
		this.siguiente = siguiente;
	}
}
