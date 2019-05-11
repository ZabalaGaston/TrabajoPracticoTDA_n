package trabajoPracticoTDA;

public interface Pila<T> {
	public boolean push(T dato);
	public T pop();
	public T peek();
	public boolean isEmpty();
	public void empty();
}
