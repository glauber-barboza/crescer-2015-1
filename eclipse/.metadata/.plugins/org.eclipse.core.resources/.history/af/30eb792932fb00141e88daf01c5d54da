package ex2_2;

import java.util.ArrayList;
import java.util.HashMap;

import listator.Filme;

public class NetFlox {
	
	ArrayList<String> filme=new ArrayList<String>();
	HashMap<Genero,Integer> FilmesJaAssistidos = new HashMap<Genero,Integer>();
	
	
	public void reproduzirFilme(Filme filme,Genero tipo){ 
	System.out.println(filme.toString());	
	
	int valordoContador= 0;
	valordoContador=buscaContadorDeViews(tipo);

		valordoContador++;
	contadorDeViews(tipo, valordoContador);
	}
	
	public void gerarRelatorio() {
		
		
	}
	private void contadorDeViews(Genero valor, int cont){
		FilmesJaAssistidos.put(valor, cont);
	}
	
	
	public int buscaContadorDeViews(Genero valor){
		int valorRetornado=0;
		boolean verifica=FilmesJaAssistidos.containsKey(valor);
		
			if (verifica) {
				valorRetornado=FilmesJaAssistidos.get(valor);
			}else{
				valorRetornado=0;
			}
			
		
		return valorRetornado;
	}
	
	


}
