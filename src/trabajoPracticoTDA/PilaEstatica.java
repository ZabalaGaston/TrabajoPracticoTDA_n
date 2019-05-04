package trabajoPracticoTDA;

public class PilaEstatica implements Pila {

	private Integer pila[];
	private int tope;
	
	public PilaEstatica(int size) {
		pila = new Integer[size];
        tope = -1;
	}
	
	@Override
	public boolean push(Integer dato) {
		if(tope != pila.length-1)
			return false;
		tope++;
		pila[tope] = dato;
		return true;
	}

	@Override
	public Integer pop() { //desapila el dato apuntado por el tope de la pila
		if(tope!=-1){
			return pila[--tope];
		}		
		return null;
	}
	
	@Override
	public Integer peek() {
		if(tope!=-1){
			return pila[tope];
		}		
		return null;
	}
	
	@Override
	public boolean isEmpty() {
		return tope!=-1;
	}
	
	@Override
	public void empty(){
		tope = -1;
	}
	
}