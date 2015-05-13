package listator;

import java.util.ArrayList;



public class Ator {
	private String nome;
	
	public Ator(String nomeAtor){
		nome=nomeAtor;
	}
	
	
	
	public String getNome() {
		return nome;
	}



	public void setNome(String ator) {
		this.nome = ator;
	}



	@Override
	public String toString() {
		
		return nome;
	}
	
}
