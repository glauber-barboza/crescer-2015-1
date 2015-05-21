package MestreCuca;

import java.util.ArrayList;
import java.util.List;

import com.sun.org.apache.xalan.internal.xsltc.compiler.sym;

import Livros.LivroReceitasDaVovo;

public class RodaABarganhaAE {

	public static void main(String[] args) {
	
		
		List<Ingrediente> ingrediente=new ArrayList<Ingrediente>();
		List<Instrucao> instrucao=new ArrayList<Instrucao>();
		
		Ingrediente batata=new Ingrediente(Medidas.colher_sopa, "Batata", 5,10);
		Ingrediente azeite=new Ingrediente(Medidas.xicara, "azeite", 2 , 5);
		Ingrediente sal=new Ingrediente(Medidas.colher_sopa, "sal", 5,10);
		
		Instrucao fritaBatata=new Instrucao("Frita a batata");
		ingrediente.add(batata);
		ingrediente.add(azeite);
		ingrediente.add(sal);
		instrucao.add(fritaBatata);
		
		Receita batatFrita=new Receita("BatataFrita", ingrediente, instrucao);
		
		LivroReceitasDaVovo vovo=new LivroReceitasDaVovo();
		
		
		vovo.inserir(batatFrita);
		
		List<Receita> teste=vovo.getTodasReceitas();
		for (Receita receita : teste) {
			List<Ingrediente> teste2= receita.ingredientes;
			for (Ingrediente ingrediente2 : teste2) {
				System.out.println(ingrediente2.getNome());
			}
		}
		
		List<Ingrediente> compara=new ArrayList<Ingrediente>();
		compara.add(batata);
		compara.add(azeite);
		compara.add(sal);
		
		vovo.ListaDecompras(compara);
			

	}

}
