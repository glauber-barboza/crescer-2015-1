package listator;

import ex2_2.Genero;
import ex2_2.NetFlox;

public class TocarFilmes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Filme filme=new Filme();
		NetFlox net=new NetFlox();
		
		Ator ator=new Ator("Pafuncio");
		Ator ator2=new Ator("Tio Gueder");
		
		filme.adicionaAtor(ator);
		filme.adicionaAtor(ator2);
		filme.adicionarFilme("Um careca sem cabelo ", Genero.acao);
		
		net.reproduzirFilme(filme, Genero.acao);
		
		Genero.acao.relatorio();
		Genero.comedia.relatorio();

	}

}
