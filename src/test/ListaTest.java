package test;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import trabajoPracticoTDA.ListaSimple;

@SuppressWarnings({"rawtypes","unchecked"})
public class ListaTest {
	
	private ListaSimple lista;

	@Before
	public void setUp() {
		lista = new ListaSimple();
	}
	
	@Test
	public void testPushBack() {
		long startTime = System.currentTimeMillis();
		lista.pushBack(1);
		long endTime = System.currentTimeMillis();
		long tiempo = endTime-startTime;
		System.out.println("Lista - Tiempo ejecucion push back: " + tiempo);
		Assert.assertEquals(Integer.valueOf(1), lista.popBack());	
	}
	
	@Test
	public void testPushFront() {
		long startTime = System.currentTimeMillis();
		lista.pushFront(3);
		long endTime = System.currentTimeMillis();
		long tiempo = endTime-startTime;
		System.out.println("Lista - Tiempo ejecucion push front: " + tiempo);
		Assert.assertEquals(Integer.valueOf(3), lista.popFront());
	}
	
	@Test
	public void testRemove() {
		long startTime = System.currentTimeMillis();
		lista.pushFront(1);
		Assert.assertEquals(true, lista.remove(1));
		long endTime = System.currentTimeMillis();
		long tiempo = endTime-startTime;
		System.out.println("Lista - Tiempo ejecucion remove: " + tiempo);
	}
	
	@Test
	@Ignore
	public void testReverse () {
		long startTime = System.currentTimeMillis();
		lista.pushBack(1);
		lista.pushBack(2);
		lista.pushBack(3);
		lista.pushBack(4);
		
		Assert.assertEquals(Integer.valueOf(1), lista.searchAt(1));
		Assert.assertEquals(Integer.valueOf(2), lista.searchAt(2));
		Assert.assertEquals(Integer.valueOf(3), lista.searchAt(3));
		Assert.assertEquals(Integer.valueOf(4), lista.searchAt(4));
		
		lista.reverse();
		
		Assert.assertEquals(Integer.valueOf(4), lista.searchAt(1));
		Assert.assertEquals(Integer.valueOf(3), lista.searchAt(2));
		Assert.assertEquals(Integer.valueOf(2), lista.searchAt(3));
		Assert.assertEquals(Integer.valueOf(1), lista.searchAt(4));
		long endTime = System.currentTimeMillis();
		long tiempo = endTime-startTime;
		System.out.println("Lista - Tiempo ejecucion reverse: " + tiempo);
	}
	
	@Test
	public void testInsertAt() {
		lista.pushFront(1);
		lista.pushFront(4);
		lista.pushFront(3);
		long startTime = System.currentTimeMillis();
		lista.insertAt(2, 10);
		long endTime = System.currentTimeMillis();
		long tiempo = endTime-startTime;
		System.out.println("Lista - Tiempo ejecucion insertAt: " + tiempo);
		Assert.assertEquals(Integer.valueOf(4), lista.searchAt(2));
	}
	
	@Test
	public void testEraseAt() {
		lista.pushFront(1);
		lista.pushFront(2);
		lista.pushFront(3);
		long startTime = System.currentTimeMillis();
		Assert.assertEquals(true,lista.eraseAt(2));
		long endTime = System.currentTimeMillis();
		long tiempo = endTime-startTime;
		System.out.println("Lista - Tiempo ejecucion eraseAt: " + tiempo);
	}
	@Test
	public void testIsEmpty () {
		long startTime = System.currentTimeMillis();
		Assert.assertEquals(true, lista.isEmpty());
		long endTime = System.currentTimeMillis();
		long tiempo = endTime-startTime;
		System.out.println("Lista - Tiempo ejecucion isEmpty: "+tiempo);
	}
	
	@Test
	public void testEmpty () {
		lista.pushFront(1);
		lista.pushFront(2);
		long startTime = System.currentTimeMillis();
		lista.empty();
		long endTime = System.currentTimeMillis();
		long tiempo = endTime-startTime;
		System.out.println("Lista - Tiempo ejecucion empty: " + tiempo);		
		Assert.assertEquals(true, lista.isEmpty());
	}
	
	@Test
	public void testSearchAt() {
		lista.pushFront(1);
		lista.pushFront(5);
		lista.pushFront(3);
		long startTime = System.currentTimeMillis();
		Assert.assertEquals(Integer.valueOf(5), lista.searchAt(2));
		long endTime = System.currentTimeMillis();
		long tiempo = endTime-startTime;
		System.out.println("Lista - Tiempo ejecucion searchAt: " + tiempo);
	}
	
	@Test
	public void testSearch() {
		lista.pushFront(1);
		lista.pushFront(2);
		lista.pushFront(3);
		lista.insertAt(2, 10);
		long startTime = System.currentTimeMillis();
		Assert.assertEquals(Integer.valueOf(2), lista.search(2));
		long endTime = System.currentTimeMillis();
		long tiempo = endTime-startTime;
		System.out.println("Lista - Tiempo ejecucion search: " + tiempo);
	}
	
	@Test
	public void testSize() {
		lista.pushFront(1);
		lista.pushFront(2);
		lista.pushFront(1);
		lista.pushFront(2);
		lista.pushFront(3);
		long startTime = System.currentTimeMillis();
		Assert.assertEquals(5, lista.size());
		long endTime = System.currentTimeMillis();
		long tiempo = endTime-startTime;
		System.out.println("Lista - Tiempo ejecucion size: " + tiempo);
	}
}