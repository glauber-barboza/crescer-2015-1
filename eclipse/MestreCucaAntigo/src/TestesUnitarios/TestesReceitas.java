package TestesUnitarios;



import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import Livros.LivroReceitasDaVovo;
import MestreCuca.Ingrediente;
import MestreCuca.Medidas;
import MestreCuca.Receita;
import MestreCuca.Instrucao;

public class TestesReceitas {
	
	
	@Test
	public void testIndexof() {
	List<Ingrediente> ingrediente=new ArrayList<Ingrediente>();
	List<Instrucao> instrucao=new ArrayList<Instrucao>();
	
	Ingrediente batata=new Ingrediente(Medidas.colher_sopa, "Batata", 5,10);
	Instrucao fritaBatata=new Instrucao("Frita a batata");
	ingrediente.add(batata);
	instrucao.add(fritaBatata);
	
	Receita batatFrita=new Receita("BatataFrita", ingrediente, instrucao);
	
	LivroReceitasDaVovo vovo=new LivroReceitasDaVovo();
	

	vovo.inserir(batatFrita);
		
	
		
		
	//	assertEquals(5, indice);
	}

}
