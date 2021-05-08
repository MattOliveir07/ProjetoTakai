package TAD_Lista_Arranjo;

public interface IndexList <E> {
		// Retorna o n�mero de elementos na lista
		public int tamanho();
		// Retorna se a lista est� vazia
		public boolean vazia();
		// Insere um elemento, e, no �ndice, i, deslocando todos os elmentos depois dele
		public void add(int i, E e) throws IndexOutOfBoundsException;
		// Retorna um elemento no �ndice i, sem remov�-lo
		public E get(int i) throws IndexOutOfBoundsException;
		// Remove e retorna o elemento do �ndice i, deslocando os elementos depois dele
		public E remove(int i) throws IndexOutOfBoundsException;
		// Troca o elemento de i com e, retornando o elemento que estava em i
		public E set(int i, E e) throws IndexOutOfBoundsException;
		}
	
