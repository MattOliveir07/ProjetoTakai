package TAD_Fila;

import exceptions.EmptyFilaException;
import exceptions.FullFilaException;

public class ArrayFila<E> implements Fila<E> {
	public E Q[];
	public int N;
	public int r = 0;
	public int f;
	


	
	public ArrayFila(int N) {
		this.N = N;
		Q = (E[]) new Object[this.N];
	}
	@Override
	public int size() {
		// TODO Auto-generated method stub
		return (N - f + r) % N;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return (r == f);
	
	}

	@Override
	public E front() throws EmptyFilaException {
		// TODO Auto-generated method stub
		if (isEmpty()) throw new EmptyFilaException("Fila vazia");
		
		return Q[f];
	}

	@Override
	public void enqueue(E element) {
		// TODO Auto-generated method stub
		if (size() == N -1) throw new FullFilaException("fila cheia");
		
		Q[r] = element;
		r = (r+1) % N;
	}

	@Override
	public E dequeue() throws EmptyFilaException {
		// TODO Auto-generated method stub
		if (isEmpty()) throw new EmptyFilaException("Fila vazia");
		
		E T = Q[f];
		Q[f] = null;
		f = (f+1) % N;
		
		return T;
		
		
	}
	public String toString() {
		
		String P = "[";
		
		if(size() > 0) {
			for(int i = 0; i <= size() - 1; i++) {
				P += Q[f + i] + ", ";}			
			}
		
		if(P.length() > 1) 
			P = P.substring(0, P.length() - 2);
		
		P += "]";
		return P;
	}
}
