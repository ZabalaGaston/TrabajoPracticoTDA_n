package trabajoPracticoTDA;

public class ListaSimple {

    private Nodo inicio;
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

	public Object popFront() {
		Object n = new Object();
		n = null;
		if(!isEmpty())
		{
			n = inicio.getValor();
			inicio = inicio.getSiguiente();
		}
		return n;
		
	}
	
    public void reverse () {
        Nodo aux = inicio;
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
	
    public boolean pushBack(Object valor){

    	Nodo nuevo = new Nodo();
        nuevo.setValor(valor);

        if (isEmpty()) {
            inicio = nuevo;
        } else{
            Nodo aux = inicio;
            while(aux.getSiguiente() != null){
                aux = aux.getSiguiente();
            }
            aux.setSiguiente(nuevo);
        }
        tamanio++;
        return true;
    }

    public void pushFront(Object valor){
        Nodo nuevo = new Nodo();
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
	  

//remove(dato), elimina un elemento de un valor determinado
	    public boolean remove(Object referencia) {
	    	
	    	Nodo aux2 = inicio;
	    	Nodo anterior = inicio;

	    	boolean encontrado = false;
	    	
	    	while(aux2 != null && aux2.getValor() != referencia){
	    		anterior = inicio;
	    		aux2 =aux2.getSiguiente();
	    	}
	    	
	    	if(aux2 != null)
	    	{
	    		anterior.setSiguiente(aux2.getSiguiente());
	    		encontrado = true;
	    	}
	    	return encontrado;
  }
		
    public Object getValor(int posicion) throws Exception{
    if(posicion>=0 && posicion<tamanio){
        if (posicion == 0) {
            return inicio.getValor();
        }else{
            Nodo aux = inicio;
            for (int i = 0; i < posicion; i++) {
                aux = aux.getSiguiente();
            }
            return aux.getValor();
        }
    } else {
        throw new Exception("Posicion inexistente en la lista.");
    }
}

    public Object search(Object referencia){
    Nodo aux = inicio;
    Object n = new Object();
    n = null;
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
        Nodo anterior = inicio;
        Nodo actual = inicio;
        Object n = new Object();
        n = null;

        if (!isEmpty())
        {
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
          Nodo aux = inicio;
          Nodo ant = inicio;
          // Recorre la lista hasta la posición ingresada.
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

	public Object searchAt(int posicion) {
		int pos = posicion -1;
		if(pos>=0 && pos<tamanio){
		       Nodo aux = inicio;
		       
		          // Recorre la lista hasta la posición ingresada.
		          for (int i = 0; i < pos; i++) {
		              aux = aux.getSiguiente();
		          }
		          return aux.getValor();
		      }
		return null;
	}
	
	  public void insertAt(int posicion, Object valor){
	  if(posicion>=0 && posicion<=tamanio){
	      Nodo nuevo = new Nodo();
	      nuevo.setValor(valor);
	      if(posicion == 0){
	          nuevo.setSiguiente(inicio);
	          inicio = nuevo;
	      }
	      else{
	          if(posicion == tamanio){
	              Nodo aux = inicio;
	              while(aux.getSiguiente() != null){
	                  aux = aux.getSiguiente();
	              }
	              aux.setSiguiente(nuevo);              
	          }
	          else{
	              Nodo aux = inicio;
	              for (int i = 0; i < (posicion-1); i++) {
	                  aux = aux.getSiguiente();
	              }
	              Nodo siguiente = aux.getSiguiente();
	              aux.setSiguiente(nuevo);
	              nuevo.setSiguiente(siguiente);
	          }
	      }
	      tamanio++;
	  }
	}
	
} 