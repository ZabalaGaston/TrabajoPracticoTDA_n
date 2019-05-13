package trabajoPracticoTDA;

public class ListaSimple<T> {

    private Nodo<T> inicio;
    private int tamanio;
    
    public void Lista(){
        inicio = null;
        tamanio = 0;
    }
    
    public boolean isEmpty(){
        return inicio == null;
    }
    
    public int getTamanio(){
        return tamanio;
    }

	public T popFront() {
		if(!isEmpty()) {
			T valor = inicio.getValor();
			inicio = inicio.getSiguiente();
			return valor;
		}
		return null;
	}
	
    public void reverse () {
        Nodo<T> aux = inicio;
        while (aux != null) { //2,4,5,7
             aux = aux.getSiguiente();
             if (aux.getSiguiente() == null) {
                aux = inicio;
             }else {
                aux = aux.getSiguiente();
             }
             aux = aux.getSiguiente();
        }
    }
	
    public boolean pushBack(T valor){

    	Nodo<T> nuevo = new Nodo<T>();
        nuevo.setValor(valor);

        if (isEmpty()) {
            inicio = nuevo;
        } else{
            Nodo<T> aux = inicio;
            while(aux.getSiguiente() != null){
                aux = aux.getSiguiente();
            }
            aux.setSiguiente(nuevo);
        }
        tamanio++;
        return true;
    }

    public void pushFront(T valor){
        Nodo<T> nuevo = new Nodo<T>();
        nuevo.setValor(valor);
        if (isEmpty()) {
            inicio = nuevo;
        } else{
            nuevo.setSiguiente(inicio);
            inicio = nuevo;
        }
        tamanio++;
    }
    
    public void empty(){
	  inicio = null;
	  tamanio = 0;
    }
	
    public boolean remove(T referencia) {//remove(dato), elimina un elemento de un valor determinado
	    	
    	Nodo<T> aux2 = inicio;
    	Nodo<T> anterior = inicio;

    	boolean encontrado = false;
    	
    	while(aux2 != null && aux2.getValor() != referencia){
    		anterior = inicio;
    		aux2 =aux2.getSiguiente();
    	}
    	
    	if(aux2 != null) {
    		anterior.setSiguiente(aux2.getSiguiente());
    		encontrado = true;
    	}
    	return encontrado;
    }
		
    public T getValor(int posicion) throws Exception{
	    if(posicion>=0 && posicion<tamanio){
	        if (posicion == 0) {
	            return inicio.getValor();
	        }else{
	            Nodo<T> aux = inicio;
	            for (int i = 0; i < posicion; i++) {
	                aux = aux.getSiguiente();
	            }
	            return aux.getValor();
	        }
	    } else {
	        throw new Exception("Posicion inexistente en la lista.");
	    }
    }

    public T search(T referencia){
	    Nodo<T> aux = inicio;
	    T n = null;
	    boolean encontrado = false;
	    while(aux != null && encontrado != true){
	        if (referencia == aux.getValor()){
	            n = aux.getValor();
	            encontrado = true;
	        }
	        else{
	            aux = aux.getSiguiente();
	        }
	    }
	    return n;
    }	  

    public int size(){
    	return tamanio;
    }
    
    public Object popBack(){
        Nodo<T> anterior = inicio;
        Nodo<T> actual = inicio;
        T n = null;

        if (!isEmpty()) {
	        while(actual.getSiguiente()!=null){
	            anterior = actual;
	            actual = actual.getSiguiente();
	        }
	        n = actual.getValor();
	        anterior.setSiguiente(null);
	    }
        return n;
    }
    
	public boolean eraseAt(int posicion){
	  if(posicion>=0 && posicion<tamanio){
	      if (posicion == 0) {
	          // Retorna el valor del inicio de la lista.
	    	  inicio = null;
	          return true;
	      }else{
	          // Crea una copia de la lista.
	          Nodo<T> aux = inicio;
	          Nodo<T> ant = inicio;
	          // Recorre la lista hasta la posici�n ingresada.
	          for (int i = 0; i < posicion; i++) {
	        	  ant = aux;
	              aux = aux.getSiguiente();
	          }
	          ant.setSiguiente(aux.getSiguiente());
	          return true;
	      }
	  } else {
	      return false;
	  }
	}

	public T searchAt(int posicion) {
		int pos = posicion -1;
		if(pos>=0 && pos<tamanio){
	      Nodo<T> aux = inicio;
	      // Recorre la lista hasta la posici�n ingresada.
          for (int i = 0; i < pos; i++) {
              aux = aux.getSiguiente();
          }
          return aux.getValor();
		}
		return null;
	}
	
	 public void insertAt(int posicion, T valor){
		 if(posicion>=0 && posicion<=tamanio){
			 Nodo<T> nuevo = new Nodo<T>();
			 nuevo.setValor(valor);
			 if(posicion == 0){
				 nuevo.setSiguiente(inicio);
				 inicio = nuevo;
			 }else{
				 if(posicion == tamanio){
					 Nodo<T> aux = inicio;
					 while(aux.getSiguiente() != null){
						 aux = aux.getSiguiente();
					 }
					 aux.setSiguiente(nuevo);              
				 }
				 else{
					 Nodo<T> aux = inicio;
					 for (int i = 0; i < (posicion-1); i++) {
						 aux = aux.getSiguiente();
					 }
					 Nodo<T> siguiente = aux.getSiguiente();
					 aux.setSiguiente(nuevo);
					 nuevo.setSiguiente(siguiente);
				 }
			 }
			 tamanio++;
		 }
	 }
	
} 