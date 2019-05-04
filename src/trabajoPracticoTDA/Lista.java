package trabajoPracticoTDA;

import java.util.ArrayList;
import java.util.Collections;

public class Lista {

	private ArrayList<Integer> objects;
	
	public Lista() {
		 objects = new ArrayList<Integer> ();
	}

	public boolean pushBack(Integer dato) { //Inserta un elemento al final
		return objects.add(dato);
	}
	
	public Integer popBack() { //retorna y borra el elemento del final
		if (!objects.isEmpty()) {
			Integer n = objects.get(objects.size());
			objects.remove(n);
			return n;			
		}
		return null;
	}
	
	public boolean pushFront(Integer dato) {
		int n = objects.size();
		objects.add(0,dato);
		return n != objects.size();
	}
	
	public boolean remove(Integer dato) { //
		return objects.remove(dato);
	}
	
	public void reverse() {
		 Collections.reverse(objects);
	}
	
	public boolean insertarAt(int posicion, Integer dato) {

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
		objects = new ArrayList<Integer>();
	}
	
	public Integer search(Integer dato) {
		for (Integer obj : objects) {
			if (((Integer) obj).compareTo(dato) == 0)
				return obj;
		}
		return null;
	}
	
	public Integer searchAt(int posicion) {
		if(objects.size()>= posicion)
			return objects.get(posicion-1);
		
		return null;
	}
	
	public int size() {
		return objects.size();
	}
}
