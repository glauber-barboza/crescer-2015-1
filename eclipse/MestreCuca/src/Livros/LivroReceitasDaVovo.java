package Livros;

import java.util.ArrayList;
import java.util.List;

import excecoes.NaoTemReceitaCException;
import MestreCuca.Ingrediente;
import MestreCuca.LivroDeReceitas;
import MestreCuca.Receita;

public class LivroReceitasDaVovo implements LivroDeReceitas{

	ArrayList<Receita> receitas=new ArrayList<Receita>();
	
	@Override
	public void inserir(Receita receita) {
		
		if(receita!=null){
		receitas.add(receita);
		}
	}

	@Override
	public void atualizar(String nome, Receita receitaAtialisada) {
		
	boolean verifica= false;
		if(nome!=null && receitaAtialisada!=null && !nome.isEmpty()){
		
		for (int i = 0; i < receitas.size(); i++) {
			if(receitas.get(i).getNome().equals(nome)){
				receitas.remove(receitas.get(i));
				receitas.add(receitaAtialisada);
				verifica= true;
				System.out.println("Receita atualizada");
				return;
			}
		}
		if(verifica){
			throw new NaoTemReceitaCException("Receita nao existe");
			}
		}
	}

	

	@Override
	public void excluir(String nome) {
		for (int i = 0; i < receitas.size(); i++) {
			if(receitas.get(i).getNome().equals(nome)){
				receitas.remove(receitas.get(i));

				System.out.println("Deletada");
				return;
			}
		}
	}

	@Override
	public List<Receita> getTodasReceitas() {
		
		return receitas;
	}

	@Override
	public Receita buscaReceitaPeloNome(String nome) {
		Receita receitaBusca = null;
		for (int i = 0; i < receitas.size(); i++) {
			if(receitas.get(i).getNome().equals(nome)){
				receitaBusca= receitas.get(i);
				System.out.println("Receita atualizada");
			}else{
				System.out.println("Essa receita não existe");
			}
			
		}
		return receitaBusca;
	}
	
	
	/*
	 * Recebe lista de receita e retorna o custo total das receitas;
	 */
	public double ValorTotalDasReceitasDoLivro(ArrayList<Receita> lista) {
		
		double valorTotalDasReceitas = 0;
		for (int i = 0; i < lista.size(); i++) {
			
			valorTotalDasReceitas +=lista.get(i).valorTotaldaReceita();
		}
		
		return valorTotalDasReceitas;
		
	}

	public ArrayList<Receita> naoTemReceitaCException(List<Ingrediente> ingredientes ){
		int ContadorMaluco=0;
		LivroReceitasDaVovo livroVovo=new LivroReceitasDaVovo();
		
		List<Receita> receitas =livroVovo.getTodasReceitas();
		List<Ingrediente> ingNaoPode = ingredientes;
		
		ArrayList<Receita> receitasSemOsIngredientes=new ArrayList<Receita>();
		
		// bolo -> farinha, agua, acucar
		for (int i = 0; i < receitas.size(); i++) {
			
			// farinha, agua, acucar
			List<Ingrediente> ingredientesDeCadaReceita =receitas.get(i).getIngredientes();
			
			for (int j = 0; j < ingredientesDeCadaReceita.size(); j++) {
				
 
				for (int b = 0; b < ingNaoPode.size(); b++) {
					// farinha
					if(ingNaoPode.get(b).equals(ingredientesDeCadaReceita.get(j))){
						ContadorMaluco++;
						
						
					}
					
				}
				if(ContadorMaluco > 0){
					
					receitasSemOsIngredientes.add(receitas.get(i));
				}
				ContadorMaluco=0;
			}
			
			
			
		}
		
		return receitasSemOsIngredientes; 
		
	}
	
	
	public void ListaDecompras(List<Receita> receitas) {
		List<Ingrediente> ingredientesCompra = receitas.get(0).getIngredientes() ;
		
		for (Receita receita : receitas) {
			
			List<Ingrediente> ingredientes=receita.getIngredientes();
			
			for (Ingrediente ingrediente : ingredientes) {
				
				for (Ingrediente ingreCompra : ingredientesCompra) {
				
					if(!ingrediente.equals(ingreCompra)){
					
						ingredientesCompra.add(ingrediente);
					}
					
					if (ingrediente.equals(ingreCompra) && !ingrediente.getMed().equals(ingreCompra.getMed())) {
						
						ingredientesCompra.add(ingrediente);
						
					}
						if(ingrediente.equals(ingreCompra) && ingrediente.getMed().equals(ingreCompra.getMed())){
							
							double quantitadeAtual=ingreCompra.getQuantidade();
							double quantitadeAtualIngredienteNovo=ingrediente.getQuantidade();
							
							double somaDeQuantidades=quantitadeAtual+quantitadeAtualIngredienteNovo;
							
							ingreCompra.setQuantidade(somaDeQuantidades);
							
							System.out.println(ingreCompra.getNome()
									+ " Tipo de medida "+ingrediente.getMed()+"Qantidade "+ 
									ingrediente.getQuantidade());
						
					}	
				}
			}
			
		}
		
	}
	


}
