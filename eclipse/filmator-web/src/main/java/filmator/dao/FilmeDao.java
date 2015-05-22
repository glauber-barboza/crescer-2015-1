package filmator.dao;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import filmator.model.Filme;

public class FilmeDao {
	
	List<Filme> filmes=new ArrayList<Filme>();

	public List<Filme> buscaTodosFilmes(){
		//Imagina que estes dados estao vindo do banco
		return filmes;
	}
	
	public List<Filme> CadastroDeFilmes(Filme filme) {
		filmes.add(filme);
		return filmes;
		
	}
	
	public Filme consultarFilmes(String nome){
		
		for (Filme filme : filmes) {
			if (filme.equals(nome)) {
				
				return filme;
				
			}
		}
		return null;
		
	}
	
	public void excluirFilme(String nome) {
		
		for (Filme filme : filmes) {
			if (filme.equals(nome)) {
				filmes.remove(filme);
				return;
		
			}
		}
		
	}
}
 