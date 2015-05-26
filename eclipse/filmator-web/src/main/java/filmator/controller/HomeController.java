package filmator.controller;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import filmator.dao.FilmeDao;
import filmator.model.Filme;
import filmator.model.Genero;

@Controller
public class HomeController {
	@Inject
	FilmeDao dao;
	
	@RequestMapping(value = "/nomeDoArquivo", method = RequestMethod.GET)
	public String home(Model model) {
		model.addAttribute("filmes",  dao.buscaTodosFilmes());

		 model.addAttribute("generos", Genero.values()); 
	

		return "nomeDoArquivo";
	}
	
	@RequestMapping(value = "/salvar", method = RequestMethod.POST)
	public String salvar(Filme filme,Model model) {
		
		
		dao.inserir(filme);
		
		  return "redirect:/"; 

	}
}

