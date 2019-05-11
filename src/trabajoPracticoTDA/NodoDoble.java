package trabajoPracticoTDA;

public class NodoDoble<T> {
	private T informacion;
	private NodoDoble<T> anterior;
	private NodoDoble<T> siguiente;

	public NodoDoble(T informacion) {
		this.informacion = informacion;
		this.anterior = null;
		this.siguiente = null;
	}
	
	public NodoDoble() {
		this.informacion = null;
		this.anterior = null;
		this.siguiente = null;
	}

	public T getInformacion() {
		return informacion;
	}

	public void setInformacion(T informacion) {
		this.informacion = informacion;
	}

	public NodoDoble<T> getSiguiente() {
		return siguiente;
	}

	public void setSiguiente(NodoDoble<T> siguiente) {
		this.siguiente = siguiente;
	}

	public NodoDoble<T> getAnterior() {
		return anterior;
	}

	public void setAnterior(NodoDoble<T> anterior) {
		this.anterior = anterior;
	}
}
