package trabajoPracticoTDA;

import java.util.ArrayList;

public class ColaDinamica implements Cola{

	private ArrayList<Object> objects;
	
	public ColaDinamica() {
		 objects = new ArrayList<Object> ();
	}

	public ColaDinamica(ArrayList<Object> objects) {
		super();
		this.objects = objects;
	}

	@Override
	public boolean offer(Object dato) {
		return objects.add(dato);
	}

	@Override
	public Object poll() {
		if (!objects.isEmpty()) {
			Object n = objects.get(0);
			objects.remove(0);
			return n;
		}
		return null;
	}

	@Override
	public Object peek() {
		if (!objects.isEmpty()) {
			Object n = objects.get(0);
			return n;	
		}
		return null;
	}

	@Override
	public boolean isEmpty() {
		return objects.isEmpty();
	}

	@Override
	public void empty() {
		objects.clear();
	}
}
