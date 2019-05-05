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
		cola.offer(1);
		Assert.assertEquals(Integer.valueOf(1), cola.peek());	
	}
	
	
	@Test
	public void testOffer() {
		cola.offer(1);
		cola.offer(2);

		Assert.assertEquals(Integer.valueOf(1), cola.peek());
	}
	
	@Test
	public void testPoll() {
		cola.offer(1);
		cola.offer(2);
		cola.offer(3);
		
		Assert.assertEquals(Integer.valueOf(1), cola.poll());
	}
	
	@Test
	public void testIsEmpty () {
		
		Assert.assertEquals(true, cola.isEmpty());
	}
	
	@Test
	public void testEmpty () {
		cola.offer(1);
		cola.offer(2);
		cola.empty();
		
		Assert.assertEquals(true, cola.isEmpty());
	}

}
