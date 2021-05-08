/**
 * 
 */
package TAD_Lista_Arranjo;

/**
 * @author mathe
 *
 */
public class Jogo {
	protected String nome; // nome da pessoa q obteve o ponto
	protected int pontos; // quantos pontos
	
	//Contrutor que cria o registro de pontos
	public Jogo(String n, int p) {
		nome = n;
		pontos = p;
	}
	//Recupera o campo nome
	public String getNome() {
		return nome;
	}
	public  int getPontos() {
		return pontos;
	}
	// Retornar uma String com a representação deste registro
	public String toString() {
		return "(" + nome + ", " + pontos + ")";
	}
	
	
	
}
