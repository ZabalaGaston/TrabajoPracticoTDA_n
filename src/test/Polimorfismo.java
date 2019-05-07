package test;

import static org.junit.Assert.*;

import org.junit.Test;

import trabajoPracticoTDA.Cola;
import trabajoPracticoTDA.ColaDinamica;
import trabajoPracticoTDA.ColaEstatica;
import trabajoPracticoTDA.Pila;
import trabajoPracticoTDA.PilaDinamica;
import trabajoPracticoTDA.PilaEstatica;

public class Polimorfismo {

	@Test
	public void polimorfismoCola() {
		Cola cola = new ColaEstatica(10);
		cola.offer(1);
		cola.offer(2);
		cola.offer("prueba");
		
		cola = new ColaDinamica();
		cola.offer(1);
		cola.offer(2);
		cola.offer("prueba");
	}
	
	@Test
	public void polimorfismoPila() {
		
		Pila pila = new PilaEstatica(10);
		pila.push(1);
		pila.push(2);
		pila.push("prueba");
		
		pila = new PilaDinamica();
		pila.push(1);
		pila.push(2);
		pila.push("prueba");
		
	}

}
