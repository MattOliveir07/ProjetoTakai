package TAD_Pilha;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Assertions;

import org.junit.jupiter.api.Test;

import exceptions.FullPilhaException;
import TAD_Pilha.ArrayPilha;

class ArrayPilhaTest {
	static final ArrayPilha<String> a = new ArrayPilha<String>(5);
	
	
    @Test
    void pilhaInteiros() {
        a.push("Matheus");
        assertEquals("[Matheus]", a.toString(), "Deve imprimir [Matheus]");
        
        a.push("Takai");
        assertEquals("[Matheus, Takai]", a.toString(), "[Matheus, Takai]");
        
        a.push("Gabriela");
        assertEquals("[Matheus, Takai, Gabriela]", a.toString(), "Deve imprimir [Matheus, Takai, Gabriela]");
        
        a.push("Carol");
        assertEquals("[Matheus, Takai, Gabriela, Carol]", a.toString(), "Deve imprimir [Matheus, Takai, Gabriela, Carol]");
        
        a.push("Alessandro");
        assertEquals("[Matheus, Takai, Gabriela, Carol, Alessandro]", a.toString(), "Deve imprimir [Matheus, Takai, Gabriela, Carol, Alessandro]");
        
        
      //Retorna o elemento no topo da pilha sem retirá-lo; ocorre erro se a pilha estiver vazia. 
      assertEquals("Alessandro", a.top(), "Deve imprimir [Alessandro]");
//--------------------------------------------------------------------------------------------------------------

        Assertions.assertThrows(FullPilhaException.class, () -> { a.push("Leo"); });
//--------------------------------------------------------------------------------------------------------------
        assertEquals("Alessandro", a.pop(), "Deve ter desempilhado 'Alessandro'");
        assertEquals("[Matheus, Takai, Gabriela, Carol]", a.toString(), "Deve imprimir [Matheus, Takai, Gabriela, Carol]");
        
        assertEquals("Carol", a.pop(), "Deve ter desempilhado 'Carol'");
        assertEquals("[Matheus, Takai, Gabriela]", a.toString(), "Deve imprimir [Matheus, Takai, Gabriela]");
        
        assertEquals("Gabriela", a.pop(), "Deve ter desempilhado 'Gabriela'");
        assertEquals("[Matheus, Takai]", a.toString(), "Deve imprimir [Matheus, Takai]");
        
        assertEquals("Takai", a.pop(), "Deve ter desempilhado 'Takai'");   
        assertEquals("[Matheus]", a.toString(), "Deve imprimir [Matheus]");
        
        assertEquals("Matheus", a.pop(), "Deve ter desempilhado 'Matheus'");
        assertEquals("[]", a.toString(), "Deve imprimir []");

        assertTrue(a.isEmpty());

        Assertions.assertThrows(FullPilhaException.class, () -> { a.pop(); });
    }
}

