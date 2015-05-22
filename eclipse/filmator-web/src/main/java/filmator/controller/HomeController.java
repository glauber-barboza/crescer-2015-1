package filmator.controller;

import java.util.Arrays;

import org.mockito.InjectMocks;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import filmator.dao.FilmeDao;

@Controller
public class HomeController {

	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Model model) {
		FilmeDao dao = new FilmeDao();
		model.addAttribute("mensagem", "fulano de tal");
		model.addAttribute("millisegundos", System.currentTimeMillis());
		model.addAttribute("filmes",  dao.buscaTodosFilmes());
		return "nomeDoArquivo";
	}
}

