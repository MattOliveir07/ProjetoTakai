package TAD_Fila;

import exceptions.EmptyFilaException;

public interface Fila<E> {
	/* Retorna o número de elementos na fila.
	* @return número de elementos na fila. */
	public int size();
	/* Retorna se a fila está vazia.
	* @return true se a fila estiver vazia, false em caso contrário. */
	public boolean isEmpty();
	/* Inspeciona o elemento à frente da fila.
	* @return o elemento à frente da fila.
	* @exception EmptyQueueException se a fila estiver vazia. */
	public E front() throws EmptyFilaException;
	/* Insere elemento no final da fila.
	* @param element, o novo elemento a ser inserido. */
	public void enqueue(E element);
	/* Remove o elemento à frente da fila.
	* @return elemento removido.
	* @exception EmptyQueueException se a fila estiver vazia. */
	public E dequeue() throws EmptyFilaException;
	
}
