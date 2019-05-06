package test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import trabajoPracticoTDA.PilaHL;

public class PilaHLTest {

	private PilaHL pilaHL;

	@Before
	public void setUp() {
		pilaHL = new PilaHL();
	}
	
	@Test
	public void testPush() {
		pilaHL.push(1);
		Assert.assertEquals(Integer.valueOf(1), pilaHL.peek());	
	}
	
	@Test
	public void testPop() {
		pilaHL.push(1);
		pilaHL.push(2);
		Integer prueba = (Integer) pilaHL.pop();
		Assert.assertEquals(Integer.valueOf(2),prueba);
	}
	
	@Test
	public void testPeek() {
		pilaHL.push(1);
		pilaHL.push(2);
		pilaHL.push(3);
		
		Assert.assertEquals(Integer.valueOf(3), pilaHL.peek());
	}
	
	@Test
	public void testIsEmpty () {
		Assert.assertEquals(true, pilaHL.isEmpty());
	}
	
	@Test
	public void testEmpty () {
		pilaHL.push(1);
		pilaHL.push(2);
		pilaHL.empty();
		
		Assert.assertEquals(true, pilaHL.isEmpty());
	}

}
