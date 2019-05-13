package test;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import trabajoPracticoTDA.PilaDinamica;

@SuppressWarnings({"rawtypes", "unchecked"})
public class PilaDinamicaTest {
	
	private PilaDinamica pila;

	@Before
	public void setUp() {
		pila = new PilaDinamica();	
	}
	@Test
	public void testPush() {
		long startTime = System.currentTimeMillis();
		pila.push(Integer.valueOf(1));
		long endTime = System.currentTimeMillis();
		long tiempo = endTime-startTime;
		System.out.println("Pila Dinamica - Tiempo ejecucion push:" + tiempo);
		Assert.assertEquals(Integer.valueOf(1), pila.peek());	
	}
	
	@Test
	public void testPop() {
		pila.push(Integer.valueOf(1));
		pila.push(Integer.valueOf(2));
		long startTime = System.currentTimeMillis();
		Integer prueba = (Integer) pila.pop();
		long endTime = System.currentTimeMillis();
		long tiempo = endTime-startTime;
		System.out.println("Pila Dinamica - Tiempo ejecucion pop:" + tiempo);
		Assert.assertEquals(Integer.valueOf(2),prueba);
	}
	
	@Test
	public void testPeek() {
		pila.push(Integer.valueOf(1));
		pila.push(Integer.valueOf(2));
		pila.push(Integer.valueOf(3));
		long startTime = System.currentTimeMillis();
		Assert.assertEquals(Integer.valueOf(3), pila.peek());
		long endTime = System.currentTimeMillis();
		long tiempo = endTime-startTime;
		System.out.println("Pila Dinamica - Tiempo ejecucion peek:" + tiempo);
	}
	
	@Test
	public void testIsEmpty () {
		long startTime = System.currentTimeMillis();
		Assert.assertEquals(true, pila.isEmpty());
		long endTime = System.currentTimeMillis();
		long tiempo = endTime-startTime;
		System.out.println("Pila Dinamica - Tiempo ejecucion isEmpty:" + tiempo);
	}
	
	@Test
	public void testEmpty () {
		pila.push(Integer.valueOf(1));
		pila.push(Integer.valueOf(2));
		long startTime = System.currentTimeMillis();
		pila.empty();
		long endTime = System.currentTimeMillis();
		long tiempo = endTime-startTime;
		System.out.println("Pila Dinamica - Tiempo ejecucion empty:" + tiempo);
		Assert.assertEquals(true, pila.isEmpty());
	}
}
