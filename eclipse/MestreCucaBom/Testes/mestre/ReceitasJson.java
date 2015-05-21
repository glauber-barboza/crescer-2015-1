package mestre;

import static org.junit.Assert.assertEquals;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import MestreCucaa.LivroReceitasJson;
import Model.Ingrediente;
import Model.Receita;
import Model.UnidadeMedida;

public class ReceitasJson {
	
	@Test
	public void testeSalvarNotacaoJson() throws Exception {
		
		String caminho ="C:\\Users\\projetocrescer\\Desktop\\CwiGlauber\\eclipse\\MestreCucaBom\\salvarReceitas\\receitas.json";
		String diretorio ="C:\\Users\\projetocrescer\\Desktop\\CwiGlauber\\eclipse\\MestreCucaBom\\salvarReceitas";
		File arquivos[]; 
		String nome = "";
		
		List<Receita>novasReceitas=new  ArrayList<Receita>();
		
		Receita carreteiro=new Receita("carreteiro");
		
		carreteiro.adicionarIngrediente(new Ingrediente("Carne", UnidadeMedida.KG, 1, 10));
		carreteiro.adicionarIngrediente(new Ingrediente("Arroz", UnidadeMedida.KG, 1, 5));
		
		novasReceitas.add(carreteiro);

		
	 
		arquivos = new File(diretorio).listFiles();  
		
		for(int i = 0; i < arquivos.length; i++){  
		   
			nome= arquivos[i].getName();
			System.out.println(nome);
		}
		
		novasReceitas.add(null);
		
		new LivroReceitasJson(caminho,novasReceitas);
		
		
		
		assertEquals("receitas.json", nome);
		

	}

}
