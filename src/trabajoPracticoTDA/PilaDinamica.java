package trabajoPracticoTDA;
import java.util.ArrayList;

public class PilaDinamica implements Pila{

	private ArrayList<Object> objects;
	
	public PilaDinamica() {
		 objects = new ArrayList<Object> ();
	}

	public PilaDinamica(ArrayList<Object> objects) {
		super();
		this.objects = objects;
	}
	
	@Override
	public boolean push(Object dato) {
		return objects.add(dato);
	}

	@Override
	public Object pop() { //desapila el dato apuntado por el tope de la pila
		if (!objects.isEmpty()) {
			Object n = objects.get(objects.size());
			objects.remove(objects.size());
			return n;			
		}
		return null;
	}
	
	@Override
	public Object peek() {
		return objects.get(objects.size());
	}
	
	@Override
	public boolean isEmpty() {
		return objects.isEmpty();
	}
	
	@Override
	public void empty(){
		objects = new ArrayList<Object>();
	}
}
