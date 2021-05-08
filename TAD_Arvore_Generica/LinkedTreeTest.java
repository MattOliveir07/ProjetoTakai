package TAD_Arvore_Generica;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;
import position.Position;
import TAD_Arvore_Generica.LinkedTree;
import TAD_Arvore_Generica.TreeNode;
import TAD_Arvore_Generica.TreePosition;
import TAD_Lista_Nodo.NodePositionList;
import TAD_Lista_Nodo.PositionList;

class LinkedTreeTest {

	@Test

	void test() {
		TreePosition<String> raiz;
		Position<Position<String>> p, s;
		PositionList<Position<String>> filhos;
		LinkedTree<String> T = criarArvoreT();
	//	System.out.println(T.parentheticRepresentation(T, T.root()));
	//	System.out.println(T.toStringPostorder(T, T.root()));

		assertFalse(T.isEmpty());
	//	assertEquals(4, T.height1(T), "Altura da Árvore T");
	//	assertEquals(4, T.height2(T, T.root()), "Altura da Árvore T");
		assertEquals("[Concessionaria, Bugs, Carros, Volkswagen, Jetta, Golf, "
+ "Voyage, G4, G5, G6, G7, Chevrolet, Triciculo, Motos, XJ6, S1000, Hornet]",
T.toString(), "Pré-ordem da Árvore T ");

		raiz = T.root();
		filhos = raiz.getChildren();

		p = filhos.first();
		assertEquals("Bugs", p.element().element(), "Bugs");
		assertTrue(T.isExternal(p.element()));
		assertEquals(raiz, T.parent(p.element()), "Deve ser a raiz");

		s = filhos.next(p);
		assertEquals("Carros", s.element().element(), "Carros");
		assertTrue(T.isInternal(s.element()));
	//	assertEquals(1, T.depth(T, s.element()), "");

		T.replace(p.element(), "Vans");

		assertEquals("[Concessionaria, Vans, Carros, Volkswagen, Jetta, Golf, "
				+ "Voyage, G4, G5, G6, G7, Chevrolet, Triciculo, Motos, XJ6, S1000, Hornet]",
T.toString(), "Pré-ordem da Árvore T ");

		assertTrue(T.isRoot(raiz));
		T.swapElements(p.element(), s.element());

		assertEquals("[Concessionaria, Carros, Vans, Volkswagen, Jetta, Golf, "
				+ "Voyage, G4, G5, G6, G7, Chevrolet, Triciculo, Motos, XJ6, S1000, Hornet]",
T.toString(), "Pré-ordem da Árvore T ");

	
	
	}
	private TreeNode<String> criarFilho(TreeNode<String> p, String n) {
		PositionList<Position<String>> filhos;
		TreeNode<String> aux;

		// Obtém os Filhos de p
		filhos = p.getChildren();

		// Cria um novo filho
		aux = new TreeNode<String>();
		aux.setElement(n);
		aux.setParent(p);
		aux.setChildren(new NodePositionList<Position<String>>());
		filhos.addLast(aux);
		return aux;

	}
	public LinkedTree<String> criarArvoreT() {
		LinkedTree<String> T = new LinkedTree<String>();
		TreeNode<String> raiz, v, m, i, u;
		T.addRoot("Concessionaria");
		raiz = (TreeNode<String>) T.root();
		raiz.setChildren(new NodePositionList<Position<String>>());

		// Filhos da raiz: Eletronic R'Us
		criarFilho(raiz, "Bugs");
		v = criarFilho(raiz, "Carros");
		criarFilho(raiz, "Triciculo");
		m = criarFilho(raiz, "Motos");

		// Filhos de Vendas
		i = criarFilho(v, "Volkswagen");
		criarFilho(v, "Chevrolet");

		// Filhos de Internacional
		criarFilho(i, "Jetta");
		criarFilho(i, "Golf");
		u = criarFilho(i, "Voyage");

		// Filhos de Ultramar
		criarFilho(u, "G4");
		criarFilho(u, "G5");
		criarFilho(u, "G6");
		criarFilho(u, "G7");

		// Filhos de Manufatura
		criarFilho(m, "XJ6");
		criarFilho(m, "S1000");
		criarFilho(m, "Hornet");
		return T;

	}

}
