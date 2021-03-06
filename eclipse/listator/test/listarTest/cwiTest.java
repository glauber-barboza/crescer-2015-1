package listarTest;



import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

import listator.Ator;
import listator.Filme;



public class cwiTest {
	@Test
	public void adicionar1Ator() throws Exception {
		Ator at=new Ator("Marlon");
		Filme filme=new Filme();
		
		filme.adicionaAtor(at);
		
		ArrayList<Ator> elencoRetorno=new ArrayList<Ator>();
		
		
		
		elencoRetorno=filme.buscaAtor("Marlon");
		
		
		assertEquals(at, elencoRetorno.get(0));
		
	}
	
	@Test
	public void adicionar2Marlons2andresAtores() throws Exception {
		Ator at=new Ator("Marlon");
		Ator at1=new Ator("Marlon");
		Ator at2=new Ator("Andre");
		Ator at3=new Ator("Andre");
		
		Filme filme=new Filme();
		
		filme.adicionaAtor(at);
		filme.adicionaAtor(at1);
		filme.adicionaAtor(at2);
		filme.adicionaAtor(at3);
		
		
		ArrayList<Ator> marlon=new ArrayList<Ator>();
		ArrayList<Ator> andre=new ArrayList<Ator>();
		
		marlon=filme.buscaAtor("Marlon");
		andre=filme.buscaAtor("Andre");
		
		assertEquals(2, marlon.size());
		assertEquals(2, andre.size());
	}
	
	@Test
	public void adicionar5Atores() throws Exception {
		Ator at=new Ator("Marlon");
		Ator at1=new Ator("Marlon");
		Ator at2=new Ator("Marlon");
		Ator at3=new Ator("Marlon");
		Ator at4=new Ator("Marlon");
		
		Filme filme=new Filme();
		
		filme.adicionaAtor(at);
		filme.adicionaAtor(at1);
		filme.adicionaAtor(at2);
		filme.adicionaAtor(at3);
		filme.adicionaAtor(at4);
		
		
		ArrayList<Ator> elencoRetorno=new ArrayList<Ator>();
		
		
		elencoRetorno=filme.buscaAtor("Marlon");
		
		
		assertEquals(5, elencoRetorno.size());
		
	}

}
