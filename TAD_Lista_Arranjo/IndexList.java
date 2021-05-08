package TAD_Lista_Arranjo;

public interface IndexList <E> {
		// Retorna o número de elementos na lista
		public int tamanho();
		// Retorna se a lista está vazia
		public boolean vazia();
		// Insere um elemento, e, no índice, i, deslocando todos os elmentos depois dele
		public void add(int i, E e) throws IndexOutOfBoundsException;
		// Retorna um elemento no índice i, sem removê-lo
		public E get(int i) throws IndexOutOfBoundsException;
		// Remove e retorna o elemento do índice i, deslocando os elementos depois dele
		public E remove(int i) throws IndexOutOfBoundsException;
		// Troca o elemento de i com e, retornando o elemento que estava em i
		public E set(int i, E e) throws IndexOutOfBoundsException;
		}
	
