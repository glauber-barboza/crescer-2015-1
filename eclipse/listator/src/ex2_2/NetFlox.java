package ex2_2;

import java.util.ArrayList;

import listator.Filme;

public class NetFlox {
	
	ArrayList<String> filme=new ArrayList<String>();
	
	
	public void reproduzirFilme(Filme filme,Genero tipo){ 
	System.out.println(filme.toString());	
	tipo.adicionaContador();

	}
	public void gerarRelatorio() {
		
		
	}

}
