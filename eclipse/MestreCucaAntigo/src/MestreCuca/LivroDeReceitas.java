package MestreCuca;

import java.util.ArrayList;
import java.util.List;

public interface LivroDeReceitas {

	void inserir(Receita receita);
	void atualizar(String nome, Receita receitaAtialisada);
	void excluir(String nome);
	List<Receita> getTodasReceitas();
	Receita buscaReceitaPeloNome(String nome);

}
