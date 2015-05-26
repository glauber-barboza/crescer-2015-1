package filmator.dao;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.inject.Inject;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import filmator.model.Filme;


	@Component
	public class FilmeDao {

		@Inject
		private JdbcTemplate jdbcTemplate;
		
		
		public void inserir(Filme filme){
			jdbcTemplate.update("INSERT INTO Filme (nome,datalancamento,sinopse,caminhoimg,genero)"
					+ " VALUES (?,?,?,?,?)", filme.getNomeFilme(), filme.getDataLancamento(),filme.getSinopse(),
					filme.getImg(),filme.getGenero().name());
		}


		public Object buscaTodosFilmes() {
			// TODO Auto-generated method stub
			return null;
		}
		
	}
	
	/*
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
		*/
	

 