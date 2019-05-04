package trabajoPracticoTDA;

public class PilaCL implements Pila{

	private Lista lista;

	@Override
	public boolean push(Integer dato) {
		return lista.pushBack(dato);
	}

	@Override
	public Integer pop() {
		return lista.popBack();
	}

	@Override
	public Integer peek() {
		return lista.searchAt(0);
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
