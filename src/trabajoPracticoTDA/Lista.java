package trabajoPracticoTDA;

import java.util.ArrayList;
import java.util.Collections;

public class Lista {

	private ArrayList<Object> objects;
	
	public Lista() {
		 objects = new ArrayList<Object> ();
	}

	public boolean pushBack(Object dato) {//Inserta un elemento al final
		return objects.add(dato);
	}
	
	public Object popBack() {//retorna y borra el elemento del final
		if (!objects.isEmpty()) {
			Object n = objects.get(objects.size()-1);
			objects.remove(objects.size()-1);
			return n;			
		}
		return null;
	}
	
	public boolean pushFront(Object dato) {
		int n = objects.size();
		objects.add(0,dato);
		return n != objects.size();
	}
	
	public Object popFront() {
		Object n = objects.get(0);
		objects.remove(0);
		return n;
	}
	
	public boolean remove(Object dato) {
		return objects.remove(dato);
	}
	
	public void reverse() {
		 Collections.reverse(objects);
	}
	
	public boolean insertarAt(int posicion, Object dato) {

		int n = objects.size();
		objects.add(posicion, dato);		
		return n != objects.size();
	}
	
	public boolean eraseAt(int posicion) {//eliminar por posicion
		int n = objects.size();
		objects.remove(posicion);
		return n != objects.size();
	}
	
	public boolean isEmpty() {
		return objects.isEmpty();
	}
	
	public void empty() {
		objects.clear();
	}
	
	public Object search(Object dato) {
		for (Object obj : objects) {
			if (obj.equals(dato))
				return obj;
		}
		return null;
	}
	
	public Object searchAt(int posicion) {
		if(objects.size()>= posicion)
			return objects.get(posicion-1);		
		return null;
	}
	
	public int size() {
		return objects.size();
	}
}
