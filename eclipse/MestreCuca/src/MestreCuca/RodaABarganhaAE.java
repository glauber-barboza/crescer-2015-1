package MestreCuca;

import java.util.ArrayList;
import java.util.List;

import Livros.LivroReceitasDaVovo;

public class RodaABarganhaAE {

	public static void main(String[] args) {
	
		
		List<Ingrediente> ingrediente=new ArrayList<Ingrediente>();
		List<Instrucao> instrucao=new ArrayList<Instrucao>();
		
		Ingrediente batata=new Ingrediente(Medidas.colher_sopa, "Batata", 5,10);
		Ingrediente azeite=new Ingrediente(Medidas.xicara, "azeite", 2 , 5);
		
		Instrucao fritaBatata=new Instrucao("Frita a batata");
		ingrediente.add(batata);
		ingrediente.add(azeite);
		instrucao.add(fritaBatata);
		
		Receita batatFrita=new Receita("BatataFrita", ingrediente, instrucao);
		
		LivroReceitasDaVovo vovo=new LivroReceitasDaVovo();
		
		vovo.inserir(batatFrita);
		
		List<Receita> compara=new ArrayList<Receita>();
		compara.add(batatFrita);
		
		vovo.ListaDecompras(compara);
			

	}

}
