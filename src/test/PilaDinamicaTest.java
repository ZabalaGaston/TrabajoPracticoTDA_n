package test;
import org.junit.Assert;
import org.junit.Test;

import trabajoPracticoTDA.PilaDinamica;

public class PilaDinamicaTest {
	
	private PilaDinamica pila;

	@Test
	public void testPush() {
		pila = new PilaDinamica();
		pila.push(1);
		Assert.assertEquals(Integer.valueOf(1), pila.peek());	
	}
	
	@Test
	public void testPop() {
		pila = new PilaDinamica();
		pila.push(1);
		pila.push(2);
		Integer prueba = (Integer) pila.pop();
		Assert.assertEquals(Integer.valueOf(2),prueba);
	}
	
	@Test
	public void testPeek() {
		pila = new PilaDinamica();
		pila.push(1);
		pila.push(2);
		pila.push(3);
		
		Assert.assertEquals(Integer.valueOf(3), pila.peek());
	}
	
	@Test
	public void testIsEmpty () {
		pila = new PilaDinamica();
		Assert.assertEquals(true, pila.isEmpty());
	}
	
	@Test
	public void testEmpty () {
		pila = new PilaDinamica();
		pila.push(1);
		pila.push(2);
		pila.empty();
		
		Assert.assertEquals(true, pila.isEmpty());
	}

}

