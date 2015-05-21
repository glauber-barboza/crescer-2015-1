package TestarNamao;

import java.util.ArrayList;
import java.util.List;

import MestreCucaa.LivroReceitas;
import MestreCucaa.LivroReceitasJson;
import Model.Ingrediente;
import Model.Receita;
import Model.UnidadeMedida;

public class RodaABarganhaAE {

	public static void main(String[] args) {
		
		
		String caminho ="C:\\Users\\projetocrescer\\Desktop\\CwiGlauber\\eclipse\\MestreCucaBom\\salvarReceitas\\receitas.json";
		
		List<Receita>novasReceitas=new  ArrayList<Receita>();
		
		Receita carreteiro=new Receita("carreteiro");
		
		carreteiro.adicionarIngrediente(new Ingrediente("Carne", UnidadeMedida.KG, 1, 10));
		carreteiro.adicionarIngrediente(new Ingrediente("Arroz", UnidadeMedida.KG, 1, 5));
		
		novasReceitas.add(carreteiro);

		
		
		
		
		novasReceitas.add(null);
		
		new LivroReceitasJson(caminho,novasReceitas);
		
		
		
		
		

	}

}
