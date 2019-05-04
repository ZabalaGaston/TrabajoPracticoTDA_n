package trabajoPracticoTDA;

public class ColaCL implements Cola {

	private Lista lista;
	
	@Override
	public boolean offer(Integer dato) {
		return lista.pushBack(dato);
	}

	@Override
	public Integer poll() {
		Integer dato = lista.searchAt(0);
		lista.remove(dato);
		return dato;
	}

	@Override
	public Integer peek() {
		Integer dato = lista.searchAt(0);
		return dato;
	}

	@Override
	public boolean isEmpty() {
		return lista.isEmpty();
	}

	@Override
	public void empty() {
		lista.empty();
	}

}
