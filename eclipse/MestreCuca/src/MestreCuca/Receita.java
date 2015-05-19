package MestreCuca;

import java.util.ArrayList;
import java.util.List;

public class Receita {
	
	private String nome;
	
	
	List<Ingrediente> ingredientes=new ArrayList<Ingrediente>();
	List<Instrucao>instrucao =new ArrayList<Instrucao>();
	
	public Receita(String nome,List<Ingrediente> ingredientes,List<Instrucao>instrucao){
		this.nome=nome;
		this.ingredientes=ingredientes;
		this.instrucao=instrucao;
		
	}
	
	/*Metodo que pega o valor total de uma receita
	 * 
	 */
public double valorTotaldaReceita(){
	double precoReceita = 0;
		for (int i = 0; i < ingredientes.size(); i++) {
			
			precoReceita+=ingredientes.get(i).getValorProduto();
		}

		
		return precoReceita;
		
			
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Ingrediente> getIngredientes() {
		return ingredientes;
	}

	public void setIngredientes(List<Ingrediente> ingredientes) {
		this.ingredientes = ingredientes;
	}

	public List<Instrucao> getInstrucao() {
		return instrucao;
	}

	public void setInstrucao(List<Instrucao> instrucao) {
		this.instrucao = instrucao;
	}
	
	
	

}
