package test;


import java.util.Random;

import org.junit.Ignore;
import org.junit.Test;

import trabajoPracticoTDA.ColaDinamica;
import trabajoPracticoTDA.ColaEstatica;
import trabajoPracticoTDA.ListaSimple;
import trabajoPracticoTDA.PilaDinamica;
import trabajoPracticoTDA.PilaEstatica;

@SuppressWarnings({"rawtypes", "unchecked"})
public class TiemposTest {

	@Test
	public void testColas() {
		
		ColaEstatica estatica = new ColaEstatica(Object.class, 1000000);
		ColaDinamica dinamica = new ColaDinamica();
		
		double i = 0;
		
		long startTime = System.currentTimeMillis();
		while(i<1000000) {
			estatica.offer(new Random().nextInt(0 + 9));
			i++;
		}
		
		long endTime = System.currentTimeMillis();
		long diferenciaEstatica = endTime - startTime;
		
		i = 0;
		
		startTime = System.currentTimeMillis();
		while(i<1000000) {
			dinamica.offer(new Random().nextInt(0 + 9));
			i++;
		}
		endTime = System.currentTimeMillis();
		
		long diferenciaDinamica = endTime-startTime;
		System.out.println("Rendimiento - Cola estatica: " + diferenciaEstatica);
		System.out.println("Rendimiento - Cola dinamica: " + diferenciaDinamica);
	}
	
	@Test
	public void testPilas() {
		PilaEstatica estatica = new PilaEstatica(Integer.class, 1000000);
		PilaDinamica dinamica = new PilaDinamica();
		
		double i = 0;
		
		long startTime = System.currentTimeMillis();
		while(i<1000000) {
			estatica.push(new Random().nextInt(0 + 9));
			i++;
		}

		long endTime = System.currentTimeMillis();
		long diferenciaEstatica = endTime-startTime;
		
		i = 0;
		
		startTime = System.currentTimeMillis();
		while(i<1000000) {
			dinamica.push(new Random().nextInt(0 + 9));
			i++;
		}
		endTime = System.currentTimeMillis();
		
		long diferenciaDinamica = endTime-startTime;
		System.out.println("Rendimiento - Pila estatica: " + diferenciaEstatica);
		System.out.println("Rendimiento - Pila dinamica: " + diferenciaDinamica);
	}
	
	@Test
	@Ignore
	public void testLista() {
		ListaSimple listaPushFront = new ListaSimple();
		ListaSimple listaPushBack = new ListaSimple();
		
		double i = 0;
		
		long startTime = System.currentTimeMillis();
		while(i<1000000) {
			listaPushFront.pushFront(new Random().nextInt(0 + 9));
			i++;
		}

		long endTime = System.currentTimeMillis();
		long diferenciaPushFront = endTime-startTime;
		
		i = 0;
		
		startTime = System.currentTimeMillis();
		while(i<1000000) {
			listaPushBack.pushBack(new Random().nextInt(0 + 9));
			i++;
		}
		endTime = System.currentTimeMillis();
		
		long diferenciaPushBack = endTime-startTime;
		System.out.println("Rendimiento - Pila estatica: " + diferenciaPushFront);
		System.out.println("Rendimiento - Pila dinamica: " + diferenciaPushBack);
	}
}
