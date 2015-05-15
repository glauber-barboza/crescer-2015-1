package listator;

import ex2_2.Genero;
import ex2_2.Iltube;
import ex2_2.NetFlox;

public class TocarFilmes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Filme filme=new Filme();
		NetFlox net=new NetFlox();
		Iltube ilt=new Iltube();
		
		Ator ator=new Ator("Pafuncio");
		Ator ator2=new Ator("Tio Gueder");
		
		filme.adicionaAtor(ator);
		filme.adicionaAtor(ator2);
		filme.adicionarFilme("Um careca sem cabelo ", Genero.acao);
		
		
		net.reproduzirFilme(filme, filme.getTipo());
		net.reproduzirFilme(filme, filme.getTipo());
		net.reproduzirFilme(filme, filme.getTipo());
		net.reproduzirFilme(filme, filme.getTipo());
		ilt.reproduzirFilme(filme, filme.getTipo());
		
		
		System.out.println(net.buscaContadorDeViews(Genero.acao));
		System.out.println(ilt.buscaContadorDeViews(Genero.acao));


	}

}