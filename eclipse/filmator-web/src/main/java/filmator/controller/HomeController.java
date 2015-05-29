package filmator.controller;

import javax.inject.Inject;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import filmator.dao.FilmeDao;
import filmator.model.Filme;
import filmator.model.Genero;
import filmator.model.Users;

@Controller
public class HomeController {
	@Inject
	FilmeDao dao;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Model model, HttpSession session) {

		Users usuario = (Users) session.getAttribute("usuarioLogado");
		model.addAttribute("filmes", dao.buscaTodosFilmes());
		model.addAttribute("usuarioNaoEstaLogado", usuario == null ? true
				: false);
		model.addAttribute("usuarioEstaLogado", usuario != null ? true : false);
		model.addAttribute("nomeUsuario",usuario == null ? "" : usuario.getLogin());
		model.addAttribute("usuarioAdm", ( usuario != null && usuario.getTipoUser() > 0));

		return "Home";
	}

	@RequestMapping(value = "/Home", method = RequestMethod.GET)
	public String clickHome(Model model, HttpSession session) {
		Users usuario = (Users) session.getAttribute("usuarioLogado");

		model.addAttribute("filmes", dao.buscaTodosFilmes());
		model.addAttribute("generos", Genero.values());
		model.addAttribute("filmes", dao.buscaTodosFilmes());
		model.addAttribute("usuarioNaoEstaLogado", usuario == null ? true : false);
		model.addAttribute("usuarioEstaLogado", usuario != null ? true : false);
		model.addAttribute("nomeUsuario",usuario == null ? "" : usuario.getLogin());
		model.addAttribute("usuarioAdm", ( usuario != null && usuario.getTipoUser() > 0));
		return "Home";
	}

	@RequestMapping(value = "/cadastrarFilme", method = RequestMethod.GET)
	public String cadastrarFilme(Model model, HttpSession session) {
		Users usuario = (Users) session.getAttribute("usuarioLogado");

		model.addAttribute("usuarioNaoEstaLogado", usuario == null ? true
				: false);
		model.addAttribute("usuarioEstaLogado", usuario != null ? true : false);
		model.addAttribute("generos", Genero.values());
		model.addAttribute("nomeUsuario",usuario == null ? "" : usuario.getLogin());
		model.addAttribute("usuarioAdm", ( usuario != null && usuario.getTipoUser() > 0));
		
		return "cadastrarFilme";
	}

	@RequestMapping(value = "/salvar", method = RequestMethod.POST)
	public String salvar(Filme filme, Model model) {

		dao.inserir(filme);

		return "redirect:/";

	}
}
