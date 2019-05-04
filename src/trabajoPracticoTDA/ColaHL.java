package trabajoPracticoTDA;

public class ColaHL extends Lista implements Cola{

	@Override
	public boolean offer(Integer dato) {
		return super.pushBack(dato);
	}

	@Override
	public Integer poll() {
		Integer objToDelete = super.searchAt(0);
		super.remove(objToDelete);
		return objToDelete;
	}

	@Override
	public Integer peek() {
		return super.searchAt(0);
	}

}
