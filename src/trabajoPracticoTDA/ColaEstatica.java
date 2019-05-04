package trabajoPracticoTDA;

public class ColaEstatica implements Cola {

	private Integer cola[];
	private int inicio,fin;

	public ColaEstatica(int size) {
		cola = new Integer[size];
        inicio = 0;
        fin = -1;
	}
	
	@Override
	public boolean offer(Integer dato) {
		if(fin == cola.length-1)
			return false;
		fin++;
		cola[fin] = dato;
		return true;
	}

	@Override
	public Integer poll() {
		if (fin == -1)
			return null;
		return cola[inicio++];
	}

	@Override
	public Integer peek() {
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
