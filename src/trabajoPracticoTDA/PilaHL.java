package trabajoPracticoTDA;

public class PilaHL extends Lista implements Pila{

	@Override
	public boolean push(Integer dato) {
		return super.pushBack(dato);
	}

	@Override
	public Integer pop() {
		return super.popBack();
	}

	@Override
	public Integer peek() {
		return super.searchAt(super.size());
	}

	
}
