package MestreCucaa;



import java.util.List;

import Model.Receita;


public interface LivroReceitas {

	void inserir(Receita receita);
	
	void atualizar(String nome, Receita receitaAtualizada);
	
	void excluir(String nome);
	
	List<Receita> getTodasReceitas();
	
	Receita buscaReceitaPeloNome(String nome);
}
