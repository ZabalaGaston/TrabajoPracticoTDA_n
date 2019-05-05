package test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import trabajoPracticoTDA.ColaDinamica;

public class ColaDinamicaTest {
	
	private ColaDinamica cola;

	@Before
	public void setUp() {
		
		cola = new ColaDinamica();
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
