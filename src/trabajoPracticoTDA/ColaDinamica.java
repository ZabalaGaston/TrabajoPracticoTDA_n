package trabajoPracticoTDA;

import java.util.ArrayList;

public class ColaDinamica implements Cola{

	private ArrayList<Integer> objects;
	
	public ColaDinamica() {
		 objects = new ArrayList<Integer> ();
	}

	public ColaDinamica(ArrayList<Integer> objects) {
		super();
		this.objects = objects;
	}

	@Override
	public boolean offer(Integer dato) {
		return objects.add(dato);
	}

	@Override
	public Integer poll() {
		if (!objects.isEmpty()) {
			Integer n = objects.get(0);
			objects.remove(n);
			return n;	
		}
		return null;
	}

	@Override
	public Integer peek() {
		if (!objects.isEmpty()) {
			Integer n = objects.get(0);
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
		objects = new ArrayList<Integer>();
	}
}
