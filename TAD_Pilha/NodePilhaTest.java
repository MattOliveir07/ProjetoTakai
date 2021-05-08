package TAD_Pilha;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import exceptions.EmptyPilhaException;
import TAD_Pilha.NodePilha;

class NodePilhaTest {
	Object o;
	static final NodePilha<Integer> a = new NodePilha<Integer>();

	@Test
	void pilhaInteiros() {
		a.push(7);
		assertEquals("[7]", a.toString(), "Deve imprimir [7]");
		
		//assertEquals(7, a.top(), "Deve imprimir [7]");
		//assertEquals("[7]", a.toString(), 			"Deve imprimir [7]");

		
		a.push(9);
		assertEquals("[9, 7]", a.toString(), "Deve imprimir [9, 7]");
		
		a.push(1);
		assertEquals("[1, 9, 7]", a.toString(),			"Deve imprimir [1, 9, 7]");
		
//---------------------------------------------------------------------------------
		//Retorna o elemento no topo da pilha sem retirá-lo; ocorre erro se a pilha estiver vazia. 
		assertEquals(1, a.top(), "Deve imprimir [1]");
//----------------------------------------------------------------------------------
		
		assertEquals(1, a.pop(), 						"Deve ter desempilhado 1");
		assertEquals("[9, 7]", a.toString(), 			"Deve imprimir [9, 7]");
//----------------------------------------------------------------------------------
		
		assertEquals(9, a.pop(), 						"Deve ter desempilhado 9");
		assertEquals("[7]", a.toString(), 				"Deve imprimir [7]");
//----------------------------------------------------------------------------------			
		
		assertEquals(7, a.pop(), 						"Deve ter desempilhado 7");
		assertEquals("[]", a.toString(), 				"Deve imprimir []");
//----------------------------------------------------------------------------------	
		
		assertTrue(a.isEmpty());

		assertThrows(EmptyPilhaException.class, () -> { a.pop(); });
		
		
//----------------------------------------------------------------------------------		
/*Teste 7)  push(5), push(3),
			pop( ),push(2), push(8), pop( ), pop( ), push(9), push(1), pop( ), push(7), push(6), pop(),
			pop(), push(4), pop(), pop( ).

		
			a.push(5);
			assertEquals("[5]", a.toString(),			"Deve imprimir [5]");
			
			a.push(3);
			assertEquals("[3, 5]", a.toString(), 		"Deve imprimir [3, 5]");
			
			assertEquals(3, a.pop(), 					"Deve ter desempilhado 3");
			assertEquals("[5]", a.toString(), 			"Deve imprimir [5]");
		
			a.push(2);
			assertEquals("[2, 5]", a.toString(), 		"Deve imprimir [2, 5]");
		
			a.push(8);
			assertEquals("[8, 2, 5]", a.toString(), 	"Deve imprimir [8, 2, 5]");
			
			assertEquals(8, a.pop(), 					"Deve ter desempilhado 8");
			assertEquals("[2, 5]", a.toString(), 		"Deve imprimir [2, 5]");
			
			assertEquals(2, a.pop(), 					"Deve ter desempilhado 2");
			assertEquals("[5]", a.toString(), 			"Deve imprimir [5]");
			
			a.push(9);
			assertEquals("[9, 5]", a.toString(), 		"Deve imprimir [9, 5]");
			
			a.push(1);
			assertEquals("[1, 9, 5]", a.toString(), 	"Deve imprimir [1, 9, 5]");
			
			assertEquals(1, a.pop(), 					"Deve ter desempilhado 1");
			assertEquals("[9, 5]", a.toString(), 		"Deve imprimir [9, 5]");
			
			a.push(7);
			assertEquals("[7, 9, 5]", a.toString(), 	"Deve imprimir [7, 9, 5]");
			
			a.push(6);
			assertEquals("[6, 7, 9, 5]", a.toString(),  "Deve imprimir [6, 7, 9, 5]");
			
			assertEquals(6, a.pop(), 					"Deve ter desempilhado 6");
			assertEquals("[7, 9, 5]", a.toString(), 	"Deve imprimir [7, 9, 5]");
			
			assertEquals(7, a.pop(), 					"Deve ter desempilhado 7");
			assertEquals("[9, 5]", a.toString(), 		"Deve imprimir [9, 5]");
			
			a.push(4);
			assertEquals("[4, 9, 5]", a.toString(), 	"Deve imprimir [4, 9, 5]");
			
			assertEquals(4, a.pop(), 					"Deve ter desempilhado 4");
			assertEquals("[9, 5]", a.toString(), 		"Deve imprimir [9, 5]");
			
			assertEquals(9, a.pop(), 					"Deve ter desempilhado 9");
			assertEquals("[5]", a.toString(), 			"Deve imprimir [5]");*/
	}
	
}

