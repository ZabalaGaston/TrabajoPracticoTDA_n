package test;
import org.junit.Assert;
import org.junit.Test;

import trabajoPracticoTDA.Lista;

public class ListaTest {
	
	private Lista lista;

	@Test
	public void testPushBack() {
		lista = new Lista();
		long startTime = System.currentTimeMillis();
		lista.pushBack(1);
		long endTime = System.currentTimeMillis();
		long tiempo = endTime-startTime;
		System.out.println("Tiempo ejecucion: "+tiempo);
		Assert.assertEquals(Integer.valueOf(1), lista.popBack());	
	}
	
	@Test
	public void testPushFront() {
		lista = new Lista();
		long startTime = System.currentTimeMillis();
		lista.pushFront(3);
		long endTime = System.currentTimeMillis();
		long tiempo = endTime-startTime;
		System.out.println("Tiempo ejecucion: "+tiempo);
		Assert.assertEquals(Integer.valueOf(3), lista.popFront());
	}
	
	@Test
	public void testRemove() {
		lista = new Lista();
		long startTime = System.currentTimeMillis();
		lista.pushFront(1);
		Assert.assertEquals(true, lista.remove(1));
		long endTime = System.currentTimeMillis();
		long tiempo = endTime-startTime;
		System.out.println("Tiempo ejecucion: "+tiempo);
	}
	
	
	
	@Test
	public void testReverse () {
		//??
	}
	
	@Test
	public void testInsertAt() {
		lista = new Lista();		
		lista.pushFront(1);
		lista.pushFront(4);
		lista.pushFront(3);
		long startTime = System.currentTimeMillis();
		lista.insertarAt(2, 10);
		long endTime = System.currentTimeMillis();
		long tiempo = endTime-startTime;
		System.out.println("Tiempo ejecucion: "+tiempo);
		Assert.assertEquals(Integer.valueOf(4), lista.searchAt(2));
	}
	
	@Test
	public void testEraseAt() {
		lista = new Lista();		
		lista.pushFront(1);
		lista.pushFront(2);
		lista.pushFront(3);
		long startTime = System.currentTimeMillis();
		Assert.assertEquals(true,lista.eraseAt(2));
		long endTime = System.currentTimeMillis();
		long tiempo = endTime-startTime;
		System.out.println("Tiempo ejecucion: "+tiempo);
	}
	@Test
	public void testIsEmpty () {
		lista = new Lista();
		long startTime = System.currentTimeMillis();
		Assert.assertEquals(true, lista.isEmpty());
		long endTime = System.currentTimeMillis();
		long tiempo = endTime-startTime;
		System.out.println("Tiempo ejecucion: "+tiempo);
	}
	
	
	@Test
	public void testEmpty () {
		lista = new Lista();
		lista.pushFront(1);
		lista.pushFront(2);
		long startTime = System.currentTimeMillis();
		lista.empty();
		long endTime = System.currentTimeMillis();
		long tiempo = endTime-startTime;
		System.out.println("Tiempo ejecucion: "+tiempo);		
		Assert.assertEquals(true, lista.isEmpty());
	}
	
	@Test
	public void testSearchAt() {
		lista = new Lista();
		lista.pushFront(1);
		lista.pushFront(5);
		lista.pushFront(3);
		long startTime = System.currentTimeMillis();
		Assert.assertEquals(Integer.valueOf(5), lista.searchAt(2));
		long endTime = System.currentTimeMillis();
		long tiempo = endTime-startTime;
		System.out.println("Tiempo ejecucion: "+tiempo);
	}
	
	@Test
	public void testSearch() {
		lista = new Lista();		
		lista.pushFront(1);
		lista.pushFront(2);
		lista.pushFront(3);
		lista.insertarAt(2, 10);
		long startTime = System.currentTimeMillis();
		Assert.assertEquals(Integer.valueOf(2), lista.search(2));
		long endTime = System.currentTimeMillis();
		long tiempo = endTime-startTime;
		System.out.println("Tiempo ejecucion: "+tiempo);
	}
	
	@Test
	public void testSize() {
		lista = new Lista();		
		lista.pushFront(1);
		lista.pushFront(2);
		lista.pushFront(1);
		lista.pushFront(2);
		lista.pushFront(3);
		long startTime = System.currentTimeMillis();
		Assert.assertEquals(5, lista.size());
		long endTime = System.currentTimeMillis();
		long tiempo = endTime-startTime;
		System.out.println("Tiempo ejecucion: "+tiempo);
	}

}