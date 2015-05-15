package listator;

import java.util.ArrayList;

import ex2_2.Genero;


public class Filme {
	String nomeFilme;
	Genero tipo;
	ArrayList<Ator> elenco=new ArrayList<Ator>();
	
	
	public void adicionarFilme(String nome, Genero tipo){
		this.nomeFilme=nome;
		this.tipo= tipo;
		
	}
	
	public void adicionaAtor(Ator Ator) {
		elenco.add(Ator);
		
	}
	
	
	public ArrayList<Ator> buscaAtor(String nome) {
		ArrayList<Ator> atoresEncontrados=new ArrayList<Ator>();
		
		for (int i = 0; i < elenco.size(); i++){
			elenco.get(i).getNome().equals(nome);
			
			if(elenco.get(i).getNome().equals(nome)){
			atoresEncontrados.add(elenco.get(i));
			}
		}
		
		return atoresEncontrados;
		
	}
	
	@Override
	public String toString() {
		String retorno="O nome do filme é: "+nomeFilme+"O genero do flme é: "+tipo+"Elenco do filme:";
		
		for (int i = 0; i < elenco.size(); i++) {
			retorno=retorno + "\n"+elenco.get(i).getNome();
			
		}
		
		
		
		return retorno;
	}
	
	public Genero getTipo(){
		
		return tipo;
		
	}

}
