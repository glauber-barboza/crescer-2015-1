package MestreCucaa;

import java.io.File;
import java.io.IOException;
import java.util.List;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import Model.Receita;

public class LivroReceitasJson implements LivroReceitas {
	
	public LivroReceitasJson(String caminho, List<Receita> receitas) {
		
		
		
		//List<Receita>receitasRecebidas = receitas;
		
	
		ObjectMapper mapper = new ObjectMapper();
		
		try {
			
			mapper.writeValue(new File(caminho), receitas);
			System.out.println("BLZ DEU CERTO");
			
		} catch (JsonGenerationException e) {
			e.printStackTrace();
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	@Override
	public void inserir(Receita receita) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void atualizar(String nome, Receita receitaAtualizada) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void excluir(String nome) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Receita> getTodasReceitas() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Receita buscaReceitaPeloNome(String nome) {
		// TODO Auto-generated method stub
		return null;
	}

}
