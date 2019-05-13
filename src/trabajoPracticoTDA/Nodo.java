package trabajoPracticoTDA;

public class Nodo<T> {

	private T valor;
    private Nodo<T> siguiente;

    public Nodo() {
    	this.valor = null;
    	this.siguiente = null;
    }
    
    public Nodo(T valor, Nodo<T> siguiente) {
		super();
		this.valor = valor;
		this.siguiente = siguiente;
	}

	public T getValor() {
		return valor;
	}

	public void setValor(T valor) {
		this.valor = valor;
	}

	public Nodo<T> getSiguiente() {
		return siguiente;
	}

	public void setSiguiente(Nodo<T> siguiente) {
        this.siguiente = siguiente;
    }   
}
