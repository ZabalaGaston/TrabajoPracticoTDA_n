package trabajoPracticoTDA;
import java.util.ArrayList;

public class PilaDinamica implements Pila{

	private ArrayList<Integer> objects;
	
	public PilaDinamica() {
		 objects = new ArrayList<Integer> ();
	}

	public PilaDinamica(ArrayList<Integer> objects) {
		super();
		this.objects = objects;
	}
	
	@Override
	public boolean push(Integer dato) {
		return objects.add(dato);
	}

	@Override
	public Integer pop() { //desapila el dato apuntado por el tope de la pila
		if (!objects.isEmpty()) {
			Integer n = objects.get(objects.size());
			objects.remove(n);
			return n;			
		}
		return null;
	}
	
	@Override
	public Integer peek() {
		return objects.get(objects.size());
	}
	
	@Override
	public boolean isEmpty() {
		return objects.isEmpty();
	}
	
	@Override
	public void empty(){
		objects = new ArrayList<Integer>();
	}
}
