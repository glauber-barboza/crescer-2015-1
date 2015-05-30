package filmator.controller;

import java.util.List;

import javax.inject.Inject;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import filmator.dao.UserDao;
import filmator.model.Genero;
import filmator.model.Users;

@Controller
public class UserController {

	@Inject
	UserDao userdao;

	@RequestMapping(value = "/logar", method = RequestMethod.POST)
	public String home(Users user, Model model, HttpSession session) {
		List<Users> userRecebido = null;
		if(!user.getLogin().isEmpty() && !user.getSenha().isEmpty()){

			userRecebido= userdao.verificaUsuario(user.getLogin(),
					user.getSenha());
		}
		

		if (userRecebido.get(0) != null && userRecebido.size() > 0) {
			model.addAttribute("loginNome", userRecebido.get(0).getLogin());
			session.setAttribute("usuarioLogado", userRecebido.get(0));
			model.addAttribute("nomeUsuario", userRecebido.get(0).getLogin());
			return "redirect:/cadastrarFilme";
		} else {
			return "redirect:/Home";
		}
	}
	
	@RequestMapping(value = "/cadastrar", method = RequestMethod.POST)
	public String Cadastrar(Users user, Model model, HttpSession session) {

		if(!user.getLogin().isEmpty() && !user.getSenha().isEmpty()){

			userdao.inserir(user);
		}
		return "redirect:/Home";
	}
}
