package test;

import org.junit.Test;

import trabajoPracticoTDA.Cola;
import trabajoPracticoTDA.ColaCL;
import trabajoPracticoTDA.ColaDinamica;
import trabajoPracticoTDA.ColaEstatica;
import trabajoPracticoTDA.ColaHL;
import trabajoPracticoTDA.Pila;
import trabajoPracticoTDA.PilaCL;
import trabajoPracticoTDA.PilaDinamica;
import trabajoPracticoTDA.PilaEstatica;
import trabajoPracticoTDA.PilaHL;

@SuppressWarnings({"rawtypes", "unchecked"})
public class PolimorfismoTest {

	@Test
	public void polimorfismoCola() {
		
		Cola cola = new ColaEstatica(Object.class, 10);
		cola.offer(1);
		cola.offer(2);
		cola.offer("prueba");
		
		cola = new ColaDinamica();
		cola.offer(1);
		cola.offer(2);
		cola.offer("prueba");
		
		cola = new ColaCL();
		cola.offer(1);
		cola.offer(2);
		cola.offer("prueba");
		
		cola = new ColaHL();
		cola.offer(1);
		cola.offer(2);
		cola.offer("prueba");
	}
	
	@Test
	public void polimorfismoPila() {
		Pila pila = new PilaEstatica(Object.class, 10);
		pila.push(1);
		pila.push(2);
		pila.push("prueba");
		
		pila = new PilaDinamica();
		pila.push(1);
		pila.push(2);
		pila.push("prueba");
		
		pila = new PilaCL();
		pila.push(1);
		pila.push(2);
		pila.push("prueba");
		
		pila = new PilaHL();
		pila.push(1);
		pila.push(2);
		pila.push("prueba");
	}
}
