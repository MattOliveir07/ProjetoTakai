/**
 * 
 */
package TAD_Lista_Arranjo;

/**
 * @author mathe
 *
 */
public class Pontos {
	public static final int maxEntradas = 10; //quantidade de vezes q os pontos serao armazenados
	protected int numEntradas; //numero de registros
	protected Jogo[] entradas; // arranjo de registros (nome e pontos)
	
	//Contrutor defalt
	public Pontos() {
		entradas = new Jogo[maxEntradas];
		numEntradas = 0;
	}

	//Retorna uma representação string da lista pontos
	public String toString() {
		String s = "[";
		for(int i = 0; i < numEntradas; i++) {
			if (i > 0) //Separar o registro por virgula
				s += ", ";
			s += entradas[i];
		}
		return s + "]";
		
		
		
	}
	//Tenta inserir um novo escore na coleção (se ele for grande o suficiente)
	public void add(Jogo e) {
		int novoPonto = e.getPontos();
		
		// o novo registro e corresponde mesmo a um dos maiores escores?
		if (numEntradas == maxEntradas) {	 // o arranjo está cheio
			if (novoPonto <= entradas[numEntradas - 1].getPontos()) {
				// nesse caso, a nova entrada, e, não é um dos maiores escores
				return; 
			} else {
				// Desprezar o último como se ele não existisse.
				numEntradas--;
			}
		} 
		
		
		// o arranjo não está cheio
		numEntradas++;
		// localiza o lugar onde o novo registro e (com escore grande) deve ficar
		int i = numEntradas - 1;
		for (; (i >= 1) && (novoPonto > entradas[i - 1].getPontos()); i--)
		entradas[i] = entradas[i - 1];   // move a entrada i uma posição para direita
		entradas[i] = e; 				// acrescenta o novo escore as entradas
		}

	
}
