package test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import trabajoPracticoTDA.ColaCLista;

public class ColaCListaTest {
	
	private ColaCLista cola;

	@Before
	public void setUp() {
		cola = new ColaCLista();
	}

	@Test
	public void testOffer() {
		cola = new ColaCLista();
		long startTime = System.currentTimeMillis();
		cola.offer(1);
		cola.offer(2);
		Assert.assertEquals(Integer.valueOf(1), cola.poll());
		long endTime = System.currentTimeMillis();
		long tiempo = endTime-startTime;
		System.out.println("ColaCL - Tiempo ejecucion offer: " + tiempo);
	}

	@Test
	public void testPeek() {
		cola = new ColaCLista();
		long startTime = System.currentTimeMillis();
		cola.offer(5);
		cola.offer(2);
		cola.offer(3);
		cola.offer(4);
		Assert.assertEquals(Integer.valueOf(5), cola.peek());
		long endTime = System.currentTimeMillis();
		long tiempo = endTime-startTime;
		System.out.println("ColaCL - Tiempo ejecucion peek: " + tiempo);
	}
	
	@Test
	public void testPoll() {
		cola = new ColaCLista();
		long startTime = System.currentTimeMillis();
		cola.offer(1);
		cola.offer(2);
		cola.offer(3);
		Assert.assertEquals(Integer.valueOf(1), cola.poll());
		Assert.assertEquals(Integer.valueOf(2), cola.poll());
		Assert.assertEquals(Integer.valueOf(3), cola.poll());
		long endTime = System.currentTimeMillis();
		long tiempo = endTime-startTime;
		System.out.println("ColaCL - Tiempo ejecucion poll: " + tiempo);
		Assert.assertEquals(true, cola.isEmpty());
	}
}
