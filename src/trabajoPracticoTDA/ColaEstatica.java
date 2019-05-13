package trabajoPracticoTDA;

import java.lang.reflect.Array;

@SuppressWarnings("unchecked")
public class ColaEstatica<T> implements Cola<T> {

	private T cola[];
	private int inicio,fin;

	public ColaEstatica(Class<T> cl, int size) {
		cola = (T[]) Array.newInstance(cl, size);
        inicio = 0;
        fin = -1;
	}
	
	@Override
	public boolean offer(T dato) {
		if((inicio == 0 && fin == cola.length-1) || (fin == inicio-1 && fin!=-1))
			return false;
		fin = fin==cola.length-1?0:fin+1;
		cola[fin] = dato;
		return true;
	}

	@Override
	public T poll() {
		if (fin == -1)
			return null;
		T object = cola[inicio];
		if(inicio == fin) {
			inicio = 0;
			fin = -1;
		} else if (inicio == cola.length-1)
			inicio = 0;
		else
			inicio++;
		return object;
	}

	@Override
	public T peek() {
		if (fin == -1)
			return null;
		return cola[inicio];
	}

	@Override
	//[TODO] Agregar las validaciones correspondientes!
	public boolean isEmpty() {
		return fin == -1;
	}

	@Override
	public void empty() {
		fin = -1;
		inicio = 0;
	}
}
