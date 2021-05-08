package TAD_Lista_Arranjo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PontosTest2 {

	@Test
	void test() {
		Pontos p = new Pontos();
		Jogo jogo;

		jogo = new Jogo("Matheus", 100);
		p.add(jogo);
		assertEquals("[(Matheus, 100)]", p.toString(), "Deve sair: [(Matheus, 100)]");
//------------------------------------------------------------------------------------
		
		jogo = new Jogo("Gabriela", 55);
		p.add(jogo);
		assertEquals("[(Matheus, 100), (Gabriela, 55)]", 
		p.toString(), "Deve sair: [(Matheus, 100), (Gabriela, 55)]");
//------------------------------------------------------------------------------------
		
		jogo = new Jogo("Maiza", 78);
		p.add(jogo);
		assertEquals("[(Matheus, 100), (Maiza, 78), (Gabriela, 55)]", 
		p.toString(),"Deve sair: [(Matheus, 100), (Maiza, 78), (Gabriela, 55)]");
//------------------------------------------------------------------------------------
		
		jogo = new Jogo("Ana", 62);
		p.add(jogo);
		assertEquals("[(Matheus, 100), (Maiza, 78), (Ana, 62), (Gabriela, 55)]", 
		p.toString(), "Deve sair: [(Matheus, 100), (Maiza, 78), (Ana, 62), (Gabriela, 55)]");
//------------------------------------------------------------------------------------		
		
		jogo = new Jogo("Carol", 54);
		p.add(jogo);
		assertEquals("[(Matheus, 100), (Maiza, 78), (Ana, 62), (Gabriela, 55), (Carol, 54)]", 
		p.toString(), "Deve sair: [(Matheus, 100), (Maiza, 78), (Ana, 62), (Gabriela, 55), (Carol, 54)]");
//------------------------------------------------------------------------------------		
		
		jogo = new Jogo("Takai", 95);
		p.add(jogo);
		assertEquals("[(Matheus, 100), (Takai, 95), (Maiza, 78), (Ana, 62), (Gabriela, 55), (Carol, 54)]", 
		p.toString(),"Deve sair: [(Matheus, 100), (Takai, 95), (Maiza, 78), (Ana, 62), (Gabriela, 55), (Carol, 54)]");
//------------------------------------------------------------------------------------		
		
		jogo = new Jogo("Alessandro", 71);
		p.add(jogo);
		assertEquals("[(Matheus, 100), (Takai, 95), (Maiza, 78), (Alessandro, 71), (Ana, 62), (Gabriela, 55), (Carol, 54)]",
		p.toString(), "Deve sair: [(Matheus, 100), (Takai, 95), (Maiza, 78), (Alessandro, 71), (Ana, 62), (Gabriela, 55), (Carol, 54)]");
		
		}
	}
