/**
 * 
 */
package TAD_Lista_Arranjo;

/**
 * @author mathe
 *
 */

public class ArrayIndexList <E> implements IndexList<E> {
private E[] A; 													// arranjo que armazena os elementos da lista
private int capacidade = 16; 									// tamanho inicial do arranjo A
private int tamanho = 0; 										// número de elementos armazenados na lista




// Cria a lista indexada com capacidade de 16 elementos
@SuppressWarnings("unchecked")


	public ArrayIndexList() {
	A = (E[]) new Object[capacidade]; // o comiplador pode gerar alerta aqui, mas está tudo ok.
	}
	

	// Retorna o número de elementos da lista
	public int tamanho() { 
		return tamanho; 
		}

	
	// Retorna se a lista está vazia
	public boolean vazio() { 
		return tamanho() == 0; 
		}
	
	
	// Retorna o elemento armazenado num dado índice
	public E get(int r) throws IndexOutOfBoundsException {
		checkIndex(r, tamanho());
		return A[r];
	}
	
	// Troca o elemento armazenado no índice
	public E set(int r, E e) throws IndexOutOfBoundsException {
		checkIndex(r, tamanho());
		E temp = A[r];
		A[r] = e;
		return temp;
	}
	
	// Insere um elemento num dado índice
	public void add(int r, E e) throws IndexOutOfBoundsException {
		checkIndex(r, tamanho() + 1);
		if (tamanho == capacidade) { // an overflow
			capacidade *= 2;
			@SuppressWarnings("unchecked")
			E[] B = (E[]) new Object[capacidade];
			for (int i = 0; i < tamanho; i++) B[i] = A[i];
			A = B;
		}
		for (int i = tamanho - 1; i >= r; i--) // desloca os elementos para cima
			A[i + 1] = A[i];
		A[r] = e;
		tamanho++;
		}
	
	// Remove o elemento armazenado num dado índice
	public E remove(int r) throws IndexOutOfBoundsException {
		checkIndex(r, tamanho());
		E temp = A[r];
		for (int i = r; i < tamanho - 1; i++) // desloca os elemento para baixo
			A[i] = A[i + 1];
		tamanho--;
		return temp;
	}
	
	// Verifica se o índice pertence ao intervalo [0, n - 1]
	protected void checkIndex(int r, int n) throws IndexOutOfBoundsException { 
		if (r < 0 || r >= n) throw new IndexOutOfBoundsException("Illegal index: " + r);
		}
	public String toString() {
		String toReturn = "(";
		if (tamanho() == 0) return "()";
		for (int i = 0; i < tamanho(); i++) toReturn += A[i].toString() + ", ";
		return toReturn.substring(0, toReturn.length() - 2) + ")";
		}


	@Override
	public boolean vazia() {
		// TODO Auto-generated method stub
		return false;
	}

}
