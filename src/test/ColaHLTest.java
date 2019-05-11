package test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import trabajoPracticoTDA.ColaCL;

public class ColaHLTest {
	
	private ColaCL cola;

	@Before
	public void setUp() {
		cola = new ColaCL();
	}

	@Test
	public void testOffer() {
		cola = new ColaCL();
		long startTime = System.currentTimeMillis();
		cola.offer(1);
		cola.offer(2);
		long endTime = System.currentTimeMillis();
		long tiempo = endTime-startTime;
		System.out.println("ColaHL - Tiempo ejecucion offer: " + tiempo);
		Assert.assertEquals(Integer.valueOf(1), cola.poll());
	}

	@Test
	public void testPeek() {
		cola = new ColaCL();
		long startTime = System.currentTimeMillis();
		cola.offer(5);
		cola.offer(2);
		cola.offer(3);
		cola.offer(4);
		Assert.assertEquals(Integer.valueOf(5), cola.peek());
		long endTime = System.currentTimeMillis();
		long tiempo = endTime-startTime;
		System.out.println("ColaHL - Tiempo ejecucion peek: " + tiempo);
	}
	
	@Test
	public void testPoll() {
		cola = new ColaCL();
		long startTime = System.currentTimeMillis();
		cola.offer(1);
		cola.offer(2);
		cola.offer(3);
		Assert.assertEquals(Integer.valueOf(1), cola.poll());
		Assert.assertEquals(Integer.valueOf(2), cola.poll());
		Assert.assertEquals(Integer.valueOf(3), cola.poll());
		long endTime = System.currentTimeMillis();
		long tiempo = endTime-startTime;
		System.out.println("ColaHL - Tiempo ejecucion poll: " + tiempo);
		Assert.assertEquals(true, cola.isEmpty());
	}
}
