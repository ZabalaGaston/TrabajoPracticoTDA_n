package trabajoPracticoTDA;

import java.lang.reflect.Array;

public class PilaEstatica<T> implements Pila<T> {

	private T pila[];
	private int tope;
	
	@SuppressWarnings("unchecked")
	public PilaEstatica(Class<T> cl, int size) {
		T[] pila = (T[]) Array.newInstance(cl, size);
		this.pila = pila;
        tope = -1;
	}
	
	@Override
	public boolean push(T dato) {
		if(tope == pila.length-1)
			return false;
		tope++;
		pila[tope] = dato;
		return true;
	}

	@Override
	public T pop() { //desapila el dato apuntado por el tope de la pila
		if(tope!=-1) {
			return pila[tope--];
		}		
		return null;
	}
	
	@Override
	public T peek() {
		if(tope!=-1) {
			return pila[tope];
		}
		return null;
	}
	
	@Override
	public boolean isEmpty() {
		return tope==-1;
	}
	
	@Override
	public void empty() {
		tope = -1;
	}
}