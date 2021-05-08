package TAD_Lista_Arranjo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ArrayIndexListTest2 {

	@Test
	void test() {
		ArrayIndexList<Integer> A = new ArrayIndexList<Integer>();
		
		
		
		
		assertEquals("()", A.toString());
		
		A.add(0, 7);
		assertEquals("(7)", A.toString());
		
		A.add(0, 11);
		assertEquals("(11, 7)", A.toString());
		
		assertEquals(11, A.get(0));
		
		A.add(1, 8);
		assertEquals("(11, 8, 7)", A.toString());
		
		A.add(2, 15);
		assertEquals("(11, 8, 15, 7)", A.toString());
		
//----------------------------------------------------------------------------------		
		assertThrows(IndexOutOfBoundsException.class, () -> { A.get(4);});
//----------------------------------------------------------------------------------	
		
		assertEquals(8, A.remove(1));
		assertEquals("(11, 15, 7)", A.toString());
//----------------------------------------------------------------------------------	
		A.add(1, 13);
		assertEquals("(11, 13, 15, 7)", A.toString());
		
		A.add(1, 3);
		assertEquals("(11, 3, 13, 15, 7)", A.toString());
		
		A.add(4, 9);
		assertEquals("(11, 3, 13, 15, 9, 7)", A.toString());
		
		assertEquals(15, A.get(3));
		assertEquals("(11, 3, 13, 15, 9, 7)", A.toString());
		
		assertEquals(15, A.set(3, 9));
		assertEquals("(11, 3, 13, 9, 9, 7)", A.toString());
		
		}
	
	}
