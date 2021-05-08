package TAD_Fila_Prioridade;

import position.Position;

public interface CompleteBinaryTree<E> extends BinaryTree<E> {

	// Adiciona um elemento � �rvore ap�s o �ltimo nodo. Retorna a nova posi��o criada.
	public Position<E> add(E elem);

	// Remove e retorna o elemento armazenado no �ltimo nodo da �rvoere.
	public E remove();

	}