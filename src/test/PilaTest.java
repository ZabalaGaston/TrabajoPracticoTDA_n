package test;

import org.junit.Assert;
import org.junit.Test;

import trabajoPracticoTDA.PilaEstatica;

public class PilaTest {
	
	private PilaEstatica pila;

	@Test
	public void testPush() {
		pila = new PilaEstatica(10);
		pila.push(1);
		Assert.assertEquals(Integer.valueOf(1), pila.peek());	
	}
	
	@Test
	public void testPop() {
		pila = new PilaEstatica(10);
		pila.push(1);
		pila.push(2);

		Assert.assertEquals(Integer.valueOf(2), pila.pop());
	}
	
	@Test
	public void testPeek() {
		pila = new PilaEstatica(10);
		pila.push(1);
		pila.push(2);
		pila.push(3);
		
		Assert.assertEquals(Integer.valueOf(3), pila.peek());
	}
	
	@Test
	public void testIsEmpty () {
		pila = new PilaEstatica(10);
		Assert.assertEquals(true, pila.isEmpty());
	}
	
	@Test
	public void testEmpty () {
		pila = new PilaEstatica(10);
		pila.push(1);
		pila.push(2);
		pila.empty();
		
		Assert.assertEquals(true, pila.isEmpty());
	}

}
