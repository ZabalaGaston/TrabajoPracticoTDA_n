package test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import trabajoPracticoTDA.ColaEstatica;

public class ColaTest {
	
	private ColaEstatica cola;

	@Before
	public void setUp() {
		
		cola = new ColaEstatica(10);
	}


	@Test
	public void testPeek() {
		long startTime = System.currentTimeMillis();
		cola.offer(1);
		Assert.assertEquals(Integer.valueOf(1), cola.peek());
		long endTime = System.currentTimeMillis();
		long tiempo = endTime-startTime;
		System.out.println("Tiempo ejecucion: "+tiempo);
	}
	
	
	@Test
	public void testOffer() {
		long startTime = System.currentTimeMillis();
		cola.offer(1);
		cola.offer(2);
		long endTime = System.currentTimeMillis();
		long tiempo = endTime-startTime;
		System.out.println("Tiempo ejecucion: "+tiempo);
		Assert.assertEquals(Integer.valueOf(1), cola.peek());
	}
	
	@Test
	public void testPoll() {
		long startTime = System.currentTimeMillis();
		cola.offer(1);
		cola.offer(2);
		cola.offer(3);
		
		Assert.assertEquals(Integer.valueOf(1), cola.poll());
		long endTime = System.currentTimeMillis();
		long tiempo = endTime-startTime;
		System.out.println("Tiempo ejecucion: "+tiempo);
	}
	
	@Test
	public void testIsEmpty () {
		long startTime = System.currentTimeMillis();
		Assert.assertEquals(true, cola.isEmpty());
		long endTime = System.currentTimeMillis();
		long tiempo = endTime-startTime;
		System.out.println("Tiempo ejecucion: "+tiempo);
	}
	
	@Test
	public void testEmpty () {
		long startTime = System.currentTimeMillis();
		cola.offer(1);
		cola.offer(2);
		cola.empty();
		long endTime = System.currentTimeMillis();
		long tiempo = endTime-startTime;
		System.out.println("Tiempo ejecucion: "+tiempo);
		Assert.assertEquals(true, cola.isEmpty());
	}

}
