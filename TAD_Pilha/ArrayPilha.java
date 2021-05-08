package TAD_Pilha;

import exceptions.FullPilhaException;

public class ArrayPilha<E> implements Pilha<E> {
    protected int capacity; 						// capacidade real do arranjo da pilha
    public static final int CAPACITY = 1000;		// capacidade default
    protected E S[]; 								// Arranjo usado para implementar a pilha
    protected int top = -1; 						// índice para o topo da pilha

    public ArrayPilha() {
        											// Se a Pilha for criada sem um quantidade máxima definida,
        											// faz com que a capacidade seja 1000, default.
        this(CAPACITY); }

    @SuppressWarnings("unchecked")
    public ArrayPilha(int cap) {
        capacity = cap;
        											// o compilador deve gerar um aviso, mas está ok
        S = (E[]) new Object[capacity];
    }

    public int size() {
        return (top + 1);
    }

    public boolean isEmpty() {
        return (top < 0);
    }

    public void push(E element) throws FullPilhaException {
        if (size() == capacity)
            throw new FullPilhaException("Stack is full.");
        S[++top] = element;
    }
    
    public E top() throws FullPilhaException {
        if (isEmpty()) throw new FullPilhaException("Stack is empty.");
        return S[top];
    }

    public E pop() throws FullPilhaException {
        E element;
        if (isEmpty()) throw new FullPilhaException("Stack is empty.");
        element = S[top];
        // desreferência S[top] para o sistema de coleta de lixo
        S[top--] = null; 
        return element;
    }

    public String toString() {
        String s;
        s = "[";
        if (size() > 0) s += S[0];
        if (size() > 1) {
            for (int i = 1; i <= size() - 1; i++) {
                s += ", " + S[i];
            }
        }
        return s + "]";
    }
}

	

