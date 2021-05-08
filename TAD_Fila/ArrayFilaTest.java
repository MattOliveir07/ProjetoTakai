package TAD_Fila;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import exceptions.EmptyFilaException;
import exceptions.FullFilaException;
import TAD_Fila.ArrayFila;

class ArrayFilaTest {

	@Test
	void test() {

		ArrayFila<Integer> F = new ArrayFila<Integer>(6);
		
		//Testa a fila vazia
		assertTrue(F.isEmpty(), "True"); 
		
		
		//Testa a Inserção na fila
		F.enqueue(2);		
		assertEquals("[2]", F.toString(), "Deve retornar [2]");

		F.enqueue(4);		
		assertEquals("[2, 4]", F.toString(), "Deve retornar [2, 4]");
		

		F.enqueue(8);		
		assertEquals("[2, 4, 8]", F.toString(), "Deve retornar [2, 4, 8]");
		
		assertFalse(F.isEmpty(), "False"); //Testa a fila vazia, no caso não esta
		

		F.enqueue(16);		
		assertEquals("[2, 4, 8, 16]", F.toString(), "Deve retornar [2, 4, 8, 16]");
		

		assertEquals(4, F.size(), "Deve retornar 4");	
		
		F.enqueue(32);		
		assertEquals("[2, 4, 8, 16, 32]", F.toString(), "Deve retornar [2, 4, 8, 16, 32]");
	
		assertThrows(FullFilaException.class, () -> { F.enqueue(3);});

		
		//Testa quem esta na frente na fila
		assertEquals(2, F.front(), "Deve retornar 2");
		
		
		//Testa a Remoção na fila
		assertEquals(2, F.dequeue(), "Deve retornar 2");
		assertEquals(4, F.front(), "Deve retornar 4");
		assertEquals(4, F.size(), "Deve retornar 4");	
		
		assertEquals(4, F.dequeue(), "Deve retornar 4");
		assertEquals(8, F.front(), "Deve retornar 8");
		assertEquals(3, F.size(), "Deve retornar 3");
		assertEquals("[8, 16, 32]", F.toString(), "Deve retornar [8, 16, 32]");
		
		assertEquals(8, F.dequeue(), "Deve retornar 8");
		assertEquals(16, F.front(), "Deve retornar 16");
		assertEquals(2, F.size(), "Deve retornar 2");
		assertEquals("[16, 32]", F.toString(), "Deve retornar [16, 32]");
		
		assertEquals(16, F.dequeue(), "Deve retornar 16");
		assertEquals(32, F.front(), "Deve retornar 32");
		assertEquals(1, F.size(), "Deve retornar 1");
		assertEquals("[32]", F.toString(), "Deve retornar [32]");
		
		assertEquals(32, F.dequeue(), "Deve retornar 32");
		assertEquals("[]", F.toString(), "Deve retornar []");
		assertTrue(F.isEmpty(), "True"); 
		
		assertThrows(EmptyFilaException.class, () -> { F.dequeue();});
		}
	
}
