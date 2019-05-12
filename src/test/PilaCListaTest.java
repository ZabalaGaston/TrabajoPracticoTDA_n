package test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import trabajoPracticoTDA.PilaCLista;

public class PilaCListaTest {

	private PilaCLista pilaCL;

	@Before
	public void setUp() {
		pilaCL = new PilaCLista();
	}
	
	@Test
	public void testPush() {
		long startTime = System.currentTimeMillis();
		pilaCL.push(1);
		long endTime = System.currentTimeMillis();
		long tiempo = endTime-startTime;
		System.out.println("PilaCL - Tiempo ejecucion push: " + tiempo);
		Assert.assertEquals(Integer.valueOf(1), pilaCL.peek());	
	}
	
	@Test
	public void testPop() {
		pilaCL.push(1);
		pilaCL.push(2);
		long startTime = System.currentTimeMillis();
		Integer prueba = (Integer) pilaCL.pop();
		long endTime = System.currentTimeMillis();
		long tiempo = endTime-startTime;
		System.out.println("PilaCL - Tiempo ejecucion pop: " + tiempo);
		Assert.assertEquals(Integer.valueOf(2),prueba);
	}
	
	@Test
	public void testPeek() {		
		pilaCL.push(1);
		pilaCL.push(2);
		pilaCL.push(3);
		long startTime = System.currentTimeMillis();
		Assert.assertEquals(Integer.valueOf(3), pilaCL.peek());
		long endTime = System.currentTimeMillis();
		long tiempo = endTime-startTime;
		System.out.println("PilaCL - Tiempo ejecucion peek: " + tiempo);
	}
	
	@Test
	public void testIsEmpty () {
		long startTime = System.currentTimeMillis();
		Assert.assertEquals(true, pilaCL.isEmpty());
		long endTime = System.currentTimeMillis();
		long tiempo = endTime-startTime;
		System.out.println("PilaCL - Tiempo ejecucion isEmpty: " + tiempo);
	}
	
	@Test
	public void testEmpty () {		
		pilaCL.push(1);
		pilaCL.push(2);
		long startTime = System.currentTimeMillis();
		pilaCL.empty();
		long endTime = System.currentTimeMillis();
		long tiempo = endTime-startTime;
		System.out.println("PilaCL - Tiempo ejecucion empty: " + tiempo);
		Assert.assertEquals(true, pilaCL.isEmpty());
	}
}
